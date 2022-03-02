package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Avatar", "Aang", (byte) 21);
        userService.saveUser("Alex", "Lion", (byte) 18);
        userService.saveUser("Naruto", "Uzumaki", (byte) 16);
        userService.saveUser("Sonic", "X", (byte) 15);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
