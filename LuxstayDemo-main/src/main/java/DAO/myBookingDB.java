package DAO;

import model.Room;
import model.myBooking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class myBookingDB {
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
    public List<myBooking> getMyBooking(String customerId){

        List<myBooking> list=new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement("select bookedroom.bookingId , bookedroom.roomId from booking , bookedroom where bookedroom.bookingId = booking.id and booking.customerId ='"+customerId+"';");
            System.out.println(ps);
            result = ps.executeQuery();
            while (result.next()){
                myBooking myBooking=new myBooking(result.getInt("bookingId"),result.getInt("roomId") );
                list.add(myBooking);
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
