package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        List<User> users = new ArrayList<>();
        users.add(new User("Dima", "Hmurii", (byte) 24));
        users.add(new User("Vlad", "Skala", (byte) 25));
        users.add(new User("Tolya", "Bugor", (byte) 52));
        users.add(new User("Jesus", "Christ", (byte) 33));

        for (User user : users) {
            userService.saveUser(user.getName(), user.getLastName(), (byte) user.getAge());
        }
        List<User> usersTable = userService.getAllUsers();
        for (User user : usersTable) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
