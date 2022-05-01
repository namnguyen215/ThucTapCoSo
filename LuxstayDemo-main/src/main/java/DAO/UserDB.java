package DAO;

import model.User;

import java.sql.*;

public class UserDB {
    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/LuxStayDb";
            String username = "root";
            String password = "vinh";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean checkUser(String email, String password) {
        String sql = "select * from User where email='" + email + "' and password='" + password+"';";
        System.out.println(sql);
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(sql);
            result = ps.executeQuery();
            System.out.println("connect thanh cong");
            if (result.next()) return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Loi syntax");
        } finally {
            try {
                if (connection != null) connection.close();
                if (ps != null) ps.close();
                if (result != null) result.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
        }
        return false;
    }
    public User getUser(String email,String password){
        User user=null;
        String sql="select * from User where email='" + email + "' and password='" + password+"';";
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(sql);
            result = ps.executeQuery();
            if (result.next()){
                user=new User(result.getString("email"),result.getString("password"),result.getString("role"));
            }
            System.out.println("access");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Loi syntax");
        } finally {
            try {
                if (connection != null) connection.close();
                if (ps != null) ps.close();
                if (result != null) result.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
        }
        return user;
    }



    public void addUser(String username, String password){
        String sql= "insert into login values ('"+username+"','"+password+"');";
        System.out.println(sql);
        Connection connection = getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Loi syntax");
        } finally {
            try {
                if (connection != null) connection.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        UserDB db=new UserDB();
        db.getUser("root", "1234");
    }
}
