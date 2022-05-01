package DAO.Admin;

import model.Room;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TKRoomDB {
    private final String getAllRoom="Select * from Room";
    private final String getRoomById="Select * from Room where id= ?";
    private final String deleteById="delete from Room where id= ?";
    private final String insertRoomSQL="insert into Room values(default,?,?,?,?,?,?,?,?,?,?)";

    private final String updateRoom="update Room " +
                            "set id=?, name=?, position_district=?, position_city=?, area=?, " +
                            "numberOfBedrooms=?, numberOfBathrooms=?, numberOfFloors=? ,"+
                            "rate=?, description=?, price=?"+
                            "where id=?";
    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/Luxstay";
            String username = "root";
            String password = "Nguyennam6626@";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Room> getListRoom(){
        List<Room> list=new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getAllRoom);
            result = ps.executeQuery();
            while (result.next()){
                Room room=new Room();
                room.setId(result.getInt("id"));
                room.setName(result.getString("name"));
                room.setPosition_district(result.getString("position_district"));
                room.setPosition_city(result.getString("position_city"));
                room.setArea(result.getFloat("area"));
                room.setNumberOfBedrooms(result.getInt("numberOfBedrooms"));
                room.setNumberOfBathrooms(result.getInt("numberOfBathrooms"));
                room.setNumberOfFloors(result.getInt("numberOfFloors"));
                room.setRate(result.getFloat("rate"));
                room.setDescription(result.getString("description"));
                room.setPrice(result.getFloat("price"));
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

    public boolean checkRoomById(int id){
        Room Room=null;
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getRoomById);
            ps.setInt(1,id);
            result = ps.executeQuery();
            if (result.next()){
                return true;
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
        return false;
    }

    public Room getRoomById(int id){
        Room Room=null;
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getRoomById);
            ps.setInt(1,id);
            result = ps.executeQuery();
            if (result.next()){
                Room=new Room();
                Room.setId(result.getInt("id"));
                Room.setName(result.getString("name"));
                Room.setPosition_district(result.getString("position_district"));
                Room.setPosition_city(result.getString("position_city"));
                Room.setArea(result.getFloat("area"));
                Room.setNumberOfBedrooms(result.getInt("numberOfBedrooms"));
                Room.setNumberOfBathrooms(result.getInt("numberOfBathrooms"));
                Room.setNumberOfFloors(result.getInt("numberOfFloors"));
                Room.setRate(result.getFloat("rate"));
                Room.setDescription(result.getString("description"));
                Room.setPrice(result.getFloat("price"));
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
        return Room;
    }

    public void deleteRoomById(int id){
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(deleteById);
            ps.setInt(1,id);
            ps.executeUpdate();
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
    }
    public boolean addRoom(Room room){
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(insertRoomSQL);
            ps.setString(1,room.getName());
            ps.setString(2,room.getPosition_district());
            ps.setString(3,room.getPosition_city());
            ps.setFloat(4,room.getArea());
            ps.setInt(5,room.getNumberOfBedrooms());
            ps.setInt(6,room.getNumberOfBathrooms());
            ps.setInt(7,room.getNumberOfFloors());
            ps.setFloat(8,room.getRate());
            ps.setString(9,room.getDescription());
            ps.setFloat(10,room.getPrice());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Loi syntax");
            return false;
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
        return true;
    }
    public void updateRoom(Room room){
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(updateRoom);
            ps.setInt(1,room.getId());
            ps.setString(2,room.getName());
            ps.setString(3,room.getPosition_district());
            ps.setString(4,room.getPosition_city());
            ps.setFloat(5,room.getArea());
            ps.setInt(6,room.getNumberOfBedrooms());
            ps.setInt(7,room.getNumberOfBathrooms());
            ps.setInt(8,room.getNumberOfFloors());
            ps.setFloat(9,room.getRate());
            ps.setString(10,room.getDescription());
            ps.setFloat(11,room.getPrice());
            ps.setInt(12,room.getId());
            ps.executeUpdate();
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
    }
    public static void main(String[] args) {
        TKRoomDB db=new TKRoomDB();
//        Room c=new Room(27,"name5",20,"lao cai","123123");
        db.getListRoom();
//        db.updateRoom(c);
//        db.addRoom(c);
    }
}
