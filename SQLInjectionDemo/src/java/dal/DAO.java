/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import business.User;
import java.io.IOException;
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
public class DAO extends DBContext {

    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        String sql = "Select * from login";
        try {
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

    public User getUserByUsername(String username) {
        User user = null;

        String query = "Select * from login where username= '" + username+"'";
        System.out.println(query);
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet users = ps.executeQuery();
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

//    public static void main(String[] args) {
//        DAO jdbc = new DAO();
//        User user = jdbc.getUserByUsername("nam");
//        System.out.println(user);
//    }

}
