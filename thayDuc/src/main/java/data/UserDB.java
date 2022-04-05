/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.*;
import business.User;

/**
 *
 * @author NamNguyen
 */
public class UserDB {

    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query
                = "INSERT INTO User (username, password) "
                + "VALUES (?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

//    public static int update(User user) {
//        ConnectionPool pool = ConnectionPool.getInstance();
//        Connection connection = pool.getConnection();
//        PreparedStatement ps = null;
//
//        String query = "UPDATE User SET "
//                + "FirstName = ?, "
//                + "LastName = ?, "
//                + "WHERE EmailAddress = ?";
//        try {
//            ps = connection.prepareStatement(query);
//            ps.setString(1, user.getFirstName());
//            ps.setString(2, user.getLastName());
//            ps.setString(3, user.getEmailAddress());
//            return ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return 0;
//        } finally {
//            DBUtil.closePreparedStatement(ps);
//            pool.freeConnection(connection);
//        }
//    }

//    public static int delete(User user) {
//        ConnectionPool pool = ConnectionPool.getInstance();
//        Connection connection = pool.getConnection();
//        PreparedStatement ps = null;
//
//        String query = "DELETE FROM User "
//                + "WHERE EmailAddress = ?";
//        try {
//            ps = connection.prepareStatement(query);
//            ps.setString(1, user.getEmailAddress());
//            return ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return 0;
//        } finally {
//            DBUtil.closePreparedStatement(ps);
//            pool.freeConnection(connection);
//        }
//    }

    public static boolean emailExists(String username) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT username FROM login "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static User selectUser(String emailAddress) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM login "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, emailAddress);
            rs = ps.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
