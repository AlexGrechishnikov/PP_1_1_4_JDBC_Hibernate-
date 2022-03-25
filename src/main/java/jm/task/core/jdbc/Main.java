package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("First", "Ones", (byte) 18);
        userService.saveUser("Second", "Twos", (byte) 28);
        userService.saveUser("Third", "Threes", (byte) 38);
        userService.saveUser("Fourth", "Petrov", (byte) 48);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
