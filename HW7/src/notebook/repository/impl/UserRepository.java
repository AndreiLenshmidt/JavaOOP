package notebook.repository.impl;

import notebook.dao.impl.FileOperation;
import notebook.mapper.impl.UserMapper;
import notebook.model.User;
import notebook.repository.GBRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private final FileOperation operation;

    public UserRepository(FileOperation operation) {
        this.mapper = new UserMapper();
        this.operation = operation;
    }

    @Override
    public List<User> findAll() {
        List<String> lines = operation.readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user, String saveFormat, boolean saveType) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);

        operation.saveAll(choiseSaveFormat(users, saveFormat, saveType), saveType);
        return user;
    }
    
    private List<String> choiseSaveFormat(List<User> users, String saveFormat, boolean saveType) {
        List<String> lines = new ArrayList<>();
        if (saveFormat.equals("1")) {
            for (User u: users) {
                lines.add(mapper.toInput(u));
            }
        }
        else {
            for (User u: users) {
                lines.add(mapper.toInput2(u));
            }
        }
        return lines;
    }
 
    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public User update(Long id, User user) {
        List<User> users = findAll();
        for (User u : users) {
            if(id == u.getId()) {
                u.setId(id);
                u.setFirstName(user.getFirstName());
                u.setLastName(user.getLastName());
                u.setPhone(user.getPhone());
            }
        }
        operation.saveAll(choiseSaveFormat(users, "1", false), false);
        return user;
    }

    @Override
    public boolean delete(Long id) {
        List<User> users = findAll();
        for (User u : users) {
            if(id == u.getId()) {
                u.setFirstName("-");
                u.setLastName("-");
                u.setPhone("-");
            }
        }
        operation.saveAll(choiseSaveFormat(users, "1", false), false);
        return false;
    }
}
