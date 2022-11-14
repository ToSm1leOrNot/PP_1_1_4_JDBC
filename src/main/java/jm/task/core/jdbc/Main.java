package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    private static final UserService user = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {
            UserService userService = new UserServiceImpl();
            userService.dropUsersTable();
            userService.createUsersTable();
            userService.saveUser("name1", " lastName1", (byte) 12);
            userService.saveUser("name2", " lastName2", (byte) 24);
            userService.saveUser("name3", " lastName3", (byte) 36);
            userService.saveUser("name4", " lastName4", (byte) 48);

            userService.removeUserById(1);
            System.out.println(userService.getAllUsers());
            userService.cleanUsersTable();
            userService.dropUsersTable();
    }
}