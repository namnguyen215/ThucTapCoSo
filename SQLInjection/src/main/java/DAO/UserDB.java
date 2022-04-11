package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDB {
    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/demoJDBC";
            String username = "root";
            String password = "Nguyennam6626@";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean checkUser(String username, String password) {
        String sql = "select * from login where username='" + username + "' and password='" + password+"';";

        Connection connection = getConnection();
        Statement ps = null;
        ResultSet result = null;
        try {
            ps = connection.createStatement();
            result = ps.executeQuery(sql);
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

    public void addUser(String username, String password){
        String sql= "insert into login values ('"+username+"','"+password+"');";
        System.out.println(sql);
        Connection connection = getConnection();
        Statement ps = null;
        try {
            ps = connection.createStatement();
            ps.executeUpdate(sql);
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
//        System.out.println(db.checkUser("aaa' or 1=1 -- ","123"));
//        db.addUser("user2","psw2");
        System.out.println(db.checkUser("aaa","zxc' or 1=1--"));
        List<String> ldy=new ArrayList<>();
        ArrayList<String> ls=new ArrayList<>();

    }
}
