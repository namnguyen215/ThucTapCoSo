/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import business.User;
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
            
            while(users.next()){
                User user=new User();
                user.setFirstName(users.getString("firstName"));
                user.setLastName(users.getString("lastName"));
                user.setEmailAddress(users.getString("emailAddress"));
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        

        return list;
    }
    
    public static void main(String[] args) {
            DAO jdbc=new DAO();
            List<User> list=jdbc.getAll();
            for(User u:list){
                System.out.println(u.getEmailAddress());
            }
    }

}
