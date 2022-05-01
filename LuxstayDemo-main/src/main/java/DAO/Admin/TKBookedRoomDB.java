package DAO.Admin;

import model.BookedRoom;
import model.BookedRoomInfo;
import model.Booking;
import model.Room;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TKBookedRoomDB {
    private final String getAllBookedRoomInfo="select * " +
            "from BookedRoom bk, Room r, Booking b " +
            "where bk.roomId=r.id and bk.bookingId=b.id";
    private final String getBookedRoomById="Select * from BookedRoom where id= ?";
    private final String deleteById="delete from BookedRoom where id= ?;";
    private final String checkBooking="select * from Booking where id=?;";
    private final String checkRoom="select * from Room where id=?;";
    private final String updateBookedRoom="update BookedRoom " +
                            "set id=?, bookingId=?, roomId=?, rate=? " +
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

    public List<BookedRoomInfo> getListBookedRoomInfo(){
        List<BookedRoomInfo> list=new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getAllBookedRoomInfo);
            result = ps.executeQuery();
            while (result.next()){
                Room room=new Room();
                Booking booking=new Booking();
                BookedRoom bookedRoom=new BookedRoom();
                BookedRoomInfo bookedRoomInfo=new BookedRoomInfo();
                bookedRoom.setId(result.getInt("bk.id"));
                bookedRoom.setBookingId(result.getInt("bookingId"));
                bookedRoom.setRoomId(result.getInt("roomId"));
                bookedRoom.setRate(result.getFloat("bk.rate"));
                room.setId(result.getInt("r.id"));
                room.setName(result.getString("name"));
                room.setPosition_district(result.getString("position_district"));
                room.setPosition_city(result.getString("position_city"));
                room.setArea(result.getInt("area"));
                room.setNumberOfBedrooms(result.getInt("numberOfBedrooms"));
                room.setNumberOfBathrooms(result.getInt("numberOfBathrooms"));
                room.setNumberOfFloors(result.getInt("numberOfFloors"));
                room.setRate(result.getFloat("r.rate"));
                room.setDescription(result.getString("description"));
                booking.setId(result.getInt("b.id"));
                booking.setCustomerId(result.getInt("customerId"));
                booking.setCheckIn(result.getDate("checkIn"));
                booking.setCheckOut(result.getDate("checkOut"));
                bookedRoomInfo.setBookedRoom(bookedRoom);
                bookedRoomInfo.setBooking(booking);
                bookedRoomInfo.setRoom(room);
                list.add(bookedRoomInfo);
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

    public boolean checkBookedRoomById(int id){
        BookedRoom BookedRoom=null;
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getBookedRoomById);
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

    public BookedRoom getBookedRoomById(int id){
        BookedRoom BookedRoom=null;
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getBookedRoomById);
            ps.setInt(1,id);
            result = ps.executeQuery();
            if (result.next()){
                BookedRoom=new BookedRoom(result.getInt("id"),result.getInt("bookingId"),result.getInt("roomId"),
                         result.getFloat("rate"));
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
        return BookedRoom;
    }

    public void deleteBookedRoomById(int id){
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

//    public boolean addBookedRoom(BookedRoom BookedRoom){
//        Connection connection = getConnection();
//        PreparedStatement ps = null;
//        ResultSet result = null;
//        try {
//            ps = connection.prepareStatement(insertBookedRoomSQL);
//            ps.setString(1,BookedRoom.getName());
//            ps.setInt(2,BookedRoom.getAge());
//            ps.setString(3,BookedRoom.getAddress());
//            ps.setString(4,BookedRoom.getPhoneNumber());
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Loi syntax");
//            return false;
//        } finally {
//            try {
//                if (connection != null) connection.close();
//                if (ps != null) ps.close();
//                if (result != null) result.close();
//
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//        return true;
//    }
    public boolean isUpdatable(BookedRoom BookedRoom){
        Connection connection = getConnection();
        PreparedStatement psBooking = null,psRoom=null;
        ResultSet resultRoom = null,resultBooking=null;
        try {
            psBooking = connection.prepareStatement(checkBooking);
            psBooking.setInt(1,BookedRoom.getBookingId());

            psRoom=connection.prepareStatement(checkRoom);
            psRoom.setInt(1,BookedRoom.getRoomId());

            resultBooking=psBooking.executeQuery();
            resultRoom=psRoom.executeQuery();

            if(resultBooking.next() && resultRoom.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Loi syntax");
            return false;
        } finally {
            try {
                if (connection != null) connection.close();
                if (psRoom != null) psRoom.close();
                if (psBooking != null) psBooking.close();
                if (resultRoom != null) resultRoom.close();
                if (resultBooking != null) resultBooking.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
        }
        return false;
    }
    public boolean updateBookedRoom(BookedRoom BookedRoom){
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(updateBookedRoom);
            ps.setInt(1,BookedRoom.getId());
            ps.setInt(2,BookedRoom.getBookingId());
            ps.setInt(3,BookedRoom.getRoomId());
            ps.setFloat(4,BookedRoom.getRate());
            ps.setInt(5,BookedRoom.getId());
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
    public static void main(String[] args) {
        TKBookedRoomDB db=new TKBookedRoomDB();
        BookedRoom c=new BookedRoom(29,109,20,7);
        System.out.println(db.isUpdatable(c));
//        db.updateBookedRoom(c);
//        db.addBookedRoom(c);
    }
}
