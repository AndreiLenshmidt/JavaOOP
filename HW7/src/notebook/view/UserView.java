package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;
        while (true) {
            String command = prompt("Input your command: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    createUser();
                    break;
                case READ:
                    readUser();
                    break;
                case LIST:
                    readAllUser();
                    break;
                case UPDATE:
                    updateUser();
                    break;
                case DELETE:
                    deleteUser();
                    break;
            }
        }
    }

    private int createUser() {
        User newUser = createUserMessege();
        String saveFormat = prompt("Choise your save format 1 or 2: ");
        userController.saveUser(newUser, saveFormat, false);
        userController.commandLogger("CREATE", newUser);
        return 1;
    }

    public User createUserMessege() {
        String firstName = prompt("name: ");
        String lastName = prompt("last name: ");
        String phone = prompt("phone: ");
        User newUser = new User(firstName, lastName, phone);
        return newUser;
    }

    private int readUser() {
        String id = prompt("Input User ID: ");
        try {
            User user = userController.readUser(Long.parseLong(id));
            userController.commandLogger("READ", user);
            System.out.println(user);
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 2;
    }

    private int readAllUser() {
        try {
            List<User> allUsers = userController.readAllUsers();
            userController.commandLogger("LIST");
            for (User user : allUsers) {
                System.out.println(user);
            }
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 3;
    }

    private int updateUser() {
        String id = prompt("Input User ID: ");
        try {
            User user = createUserMessege();
            userController.updateUser(Long.parseLong(id), user);
            User updateUser = userController.readUser(Long.parseLong(id));
            userController.commandLogger("UPDATE", updateUser);
            System.out.println("User Id: " + updateUser.getId() + " was Updated");
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 4;
    }

    private int deleteUser() {
        try {
            String id = prompt("Input User ID: ");
            User user = userController.readUser(Long.parseLong(id));
            System.out.println("User Id: " + id + " was Deleted");
            userController.deleteUser(Long.parseLong(id));
            userController.commandLogger("DELETE", user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 5;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
