package notebook.controller;

import notebook.dao.impl.FileOperation;
import notebook.model.User;
import notebook.repository.GBRepository;
import notebook.util.UserLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository<User, Long> repository;

    public UserController(GBRepository<User, Long> repository) {
        this.repository = repository;
    }

    public void commandLogger(String command, User user) {

        UserLogger logger = new UserLogger(command, user.getId());
        
        List<String> logList = new ArrayList<>();
        logList.add(logger.getDateTime() + ", " + logger.getCommand() + ", " + Long.toString(logger.getUserID()));
        
        FileOperation logfile = new FileOperation("logger");
        logfile.saveAll(logList, true);
    }

    public void commandLogger(String command) {

        UserLogger logger = new UserLogger(command, 1l);
        
        List<String> logList = new ArrayList<>();
        logList.add(logger.getDateTime() + ", " + logger.getCommand());

        FileOperation logfile = new FileOperation("logger");
        logfile.saveAll(logList, true);
    }

    public void saveUser(User user, String saveFormat, boolean saveType) {
        repository.create(user, saveFormat, false);
    }

    public void updateUser(Long id, User user) {
        repository.update(id, user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }

    public void deleteUser(Long id) {
        repository.delete(id);
    }

    public List<User> readAllUsers() {
        List<User> users = repository.findAll();
        return users;
    }
}
