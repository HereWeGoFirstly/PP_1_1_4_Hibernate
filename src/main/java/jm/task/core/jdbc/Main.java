package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Jonathan", "Joestar", (byte) 21);
        userService.saveUser("Jotaro", "Kujo", (byte) 18);
        userService.saveUser("Jean Pierre ", "Polnareff", (byte) 16);
        userService.saveUser("Noriaki", "Kakyoin", (byte) 15);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
