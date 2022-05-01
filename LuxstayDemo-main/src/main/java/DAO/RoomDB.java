package DAO;

import model.Room;
import model.listRoomByLocation;
import model.topLocation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDB {
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
    public List<listRoomByLocation> getListRoomByLocation(String position){

        List<listRoomByLocation> list=new ArrayList<>();
        String sql = "select room.id , room.name , room.numberOfBedrooms , room.rate , roomimageurl.url from room,roomimageurl where room.id = roomimageurl.roomId and room.position_city ='"+position+"';";
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(sql);
            System.out.println(ps);
            result = ps.executeQuery();
            while (result.next()){
                listRoomByLocation listRoomByLocation=new listRoomByLocation(result.getInt("id"),result.getString("name"),result.getInt("numberOfBedrooms"),result.getFloat("rate"),result.getString("url") );
                list.add(listRoomByLocation);
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
    public List<Room> getDetailRoomById(String id){

        List<Room> list=new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement("SELECT * FROM room where room.id ='"+id+"';");
            System.out.println(ps);
            result = ps.executeQuery();
            while (result.next()){
                Room room=new Room(result.getInt("id"),
                        result.getString("name"),result.getString("position_district"),result.getString("position_city"),result.getInt("area"),result.getInt("numberOfBedrooms"),result.getInt("numberOfBathrooms"),result.getInt("numberOfFloors"),result.getFloat("rate"),result.getString("description"),result.getFloat("price"));
                list.add(room);
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
