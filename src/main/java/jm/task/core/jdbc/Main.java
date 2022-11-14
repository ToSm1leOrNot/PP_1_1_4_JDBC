package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class Main {
    private static final UserService user = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {
        Util util = new Util();
        util.getConnection();
        user.createUsersTable();
        user.saveUser("Name1", "LastName1", (byte) 5);
        user.saveUser("Name2", "LastName2", (byte) 31);
        user.saveUser("Name3", "LastName3", (byte) 53);
        user.saveUser("Name4", "LastName4", (byte) 61);
        user.removeUserById(3);
        for (User allUser : user.getAllUsers()) {
            System.out.println(allUser);
        }
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}