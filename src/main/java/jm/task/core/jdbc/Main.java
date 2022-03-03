package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (UserService userService = new UserServiceImpl()) {
            userService.createUsersTable();
            userService.saveUser("Jonathan", "Joestar", (byte) 21);
            userService.saveUser("Jotaro", "Kujo", (byte) 18);
            userService.saveUser("Jean Pierre ", "Polnareff", (byte) 16);
            userService.saveUser("Noriaki", "Kakyoin", (byte) 15);
            System.out.println(userService.getAllUsers());
            userService.cleanUsersTable();
            userService.dropUsersTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
