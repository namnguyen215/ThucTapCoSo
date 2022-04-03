package DAO;

import java.sql.*;

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
        System.out.println(sql);
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

    public static void main(String[] args) {
        UserDB db=new UserDB();
        System.out.println(db.checkUser("aaa' or 1=1 -- ","123"));
    }
}
