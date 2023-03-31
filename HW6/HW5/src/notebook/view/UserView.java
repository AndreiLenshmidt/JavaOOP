package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

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
            }
        }
    }

    private int createUser() {
        String firstName = prompt("name: ");
        String lastName = prompt("last name: ");
        String phone = prompt("phone: ");
        String saveFormat = prompt("Choise your save format 1 or 2: ");
        User newUser = new User(firstName, lastName, phone);
        userController.saveUser(newUser, saveFormat, false);
        userController.commandLogger("CREATE", newUser);
        return 1;
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

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
