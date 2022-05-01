package DAO;

import model.Customer;
import model.topLocation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/luxstay";
            String username = "root";
            String password = "beomik123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public List<topLocation> getTopLocation(){

        List<topLocation> list=new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement("select room.position_city, count(id) from room group by position_city limit 6");
            System.out.println(ps);
            result = ps.executeQuery();
            while (result.next()){
                topLocation topLocation=new topLocation(result.getString("position_city"),result.getInt("count(id)") );
                list.add(topLocation);
            }
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
        return list;
    }

}
