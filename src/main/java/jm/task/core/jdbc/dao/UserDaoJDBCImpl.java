package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import static jm.task.core.jdbc.util.Util.getConnection;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

//    Connection connection = getConnection();

    public void createUsersTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS users" +
//                "(ID BIGINT NOT NULL AUTO_INCREMENT, NAME VARCHAR(255), " +
//                "LASTNAME VARCHAR(255), AGE INT, PRIMARY KEY (ID))";
//
////        try (Connection connection = getConnection();
//             Statement statement = connection.createStatement()) {
//
//            statement.executeUpdate(sql);
//            System.out.println("Таблица создана");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS users";
//
////        try (Connection connection = getConnection();
////             Statement statement = connection.createStatement()) {
//
//            statement.executeUpdate(sql);
//            System.out.println("Таблица удалена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
////        PreparedStatement preparedStatement = null;
//        String sql = "INSERT INTO users (NAME, LASTNAME, AGE) VALUES(?, ?, ?)";
//
//        try (Connection connection = getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
////            System.out.println("Пользователь добавлен");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {
//        String sql = "DELETE FROM users WHERE ID=?";
//
//        try (Connection connection = getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//            System.out.println("Пользователь удален");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() {
//        List<User> userList = new ArrayList<>();
//        String sql = "SELECT ID, NAME, LASTNAME, AGE FROM users";
//
//        try (Connection connection = getConnection();
//             Statement statement = connection.createStatement()) {
//
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("ID"));
//                user.setName(resultSet.getString("NAME"));
//                user.setLastName(resultSet.getString("LASTNAME"));
//                user.setAge(resultSet.getByte("AGE"));
//                userList.add(user);
//            }
//            System.out.println("Список пользователей:");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    public void cleanUsersTable() {
//        String sql = "DELETE FROM users";
//
//        try (Connection connection = getConnection();
//             Statement statement = connection.createStatement()) {
//
//            statement.executeUpdate(sql);
//            System.out.println("Таблица очищена");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
