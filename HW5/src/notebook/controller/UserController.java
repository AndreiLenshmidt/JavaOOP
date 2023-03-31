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
        logList.add(logger.getDateTime());
        logList.add(logger.getCommand());
        logList.add(Long.toString(logger.getUserID()));

        FileOperation logfile = new FileOperation("logger");
        logfile.saveAll(logList, true);
    }

    public void saveUser(User user, String saveFormat, boolean saveType) {
        repository.create(user, saveFormat, false);
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
}
