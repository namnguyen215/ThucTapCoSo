/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import business.User;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NamNguyen
 */
public class DAO {

    public List<User> getAll() {
        Connection connection = null;
        try {
            // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName= demoJDBC";
            String username = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connect");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        List<User> list = new ArrayList<>();
        String sql = "Select * from login";
        try {
            System.out.println(connection + "----");
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet users = ps.executeQuery();
            while (users.next()) {
                User user = new User();
                user.setUsername(users.getString("username"));
                user.setPassword(users.getString("password"));
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public void insert(User user) throws IOException {
        Connection connection = null;
        try {
            // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName= demoJDBC";
            String username = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connect");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        PreparedStatement ps;
        String query = "Insert into login values(" + user.getUsername() + "," + user.getPassword() + ")";
        try {
            ps = connection.prepareStatement(query);
            ResultSet users = ps.executeQuery();
            while (users.next()) {
                user = new User();
                user.setUsername(users.getString("username"));
                user.setPassword(users.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User getUserByUsername(String username, String password) {
        Connection connection = getConnection();
        try {
            // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName= demoJDBC";
            String username1 = "sa";
            String password1 = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username1, password1);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

        User user = null;

//        String query = "Select * from login where username= '" + username+"'";
        String query = "Select * from login where username= ? and password=?";
//        System.out.println(query);
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet users = ps.executeQuery();
            System.out.println(ps);
            while (users.next()) {
                user = new User();
                user.setUsername(users.getString("username"));
                user.setPassword(users.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    public static void main(String[] args) {
        DAO jdbc = new DAO();
        User user = jdbc.getUserByUsername("aaa' or 1=1--","123");
        System.out.println(user);
        System.out.println("-----------" + jdbc.getAll().size());
    }

    private Connection getConnection() {
        Connection connection = null;
        try {
            // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName= demoJDBC";
            String username = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
