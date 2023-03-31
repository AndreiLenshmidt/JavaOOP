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
        
        // List<String> lines = new ArrayList<>();

        // if (saveFormat.equals("1")) {
        //     for (User u: users) {
        //         lines.add(mapper.toInput(u));
        //     }
        // }
        // else {
        //     for (User u: users) {
        //         lines.add(mapper.toInput2(u));
        //     }
        // }

        operation.saveAll(choiseSaveFormat(users, saveFormat, saveType), saveType);
        return user;
    }
    // После изменения по принципам Solid добален метод
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
    public Optional<User> update(Long id, User user) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
