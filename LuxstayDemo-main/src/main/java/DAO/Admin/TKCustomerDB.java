package DAO.Admin;
import model.Customer;

import java.sql.*;
import java.util.*;

public class TKCustomerDB {
    private final String getAllCustomer="Select * from Customer";
    private final String getCustomerById="Select * from Customer where id= ?";
    private final String deleteById="delete from Customer where id= ?";
    private final String insertCustomerSQL="insert into Customer values(default,?,?,?,?)";

    private final String updateCustomer="update Customer " +
                            "set id=?, name=?, age=?, address=?,phoneNumber=? " +
                            "where id=?";
    public Connection getConnection() {
        try {
//            String url = "jdbc:mysql://localhost:3306/LuxStayDb";
//            String username = "root";
//            String password = "vinh";
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

    public List<Customer> getListCustomer(){
        List<Customer> list=new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getAllCustomer);
            result = ps.executeQuery();
            while (result.next()){
                Customer customer = new Customer(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("age"),
                    result.getString("address"),
                    result.getString("phoneNumber")
                );
                list.add(customer);
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

    public boolean checkCustomerById(int id){
        Customer customer=null;
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getCustomerById);
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

    public Customer getCustomerById(int id){
        Customer customer=null;
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(getCustomerById);
            ps.setInt(1,id);
            result = ps.executeQuery();
            if (result.next()){
                customer=new Customer(result.getInt("id"),result.getString("name"),result.getInt("age"),
                         result.getString("address"),
                        result.getString("phoneNumber"));
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
        return customer;
    }

    public void deleteCustomerById(int id){
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
    public boolean addCustomer(Customer customer){
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(insertCustomerSQL);
            ps.setString(1,customer.getName());
            ps.setInt(2,customer.getAge());
            ps.setString(3,customer.getAddress());
            ps.setString(4,customer.getPhoneNumber());
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
    public void updateCustomer(Customer customer){
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet result = null;
        try {
            ps = connection.prepareStatement(updateCustomer);
            ps.setInt(1,customer.getId());
            ps.setString(2,customer.getName());
            ps.setInt(3,customer.getAge());
            ps.setString(4,customer.getAddress());
            ps.setString(5,customer.getPhoneNumber());
            ps.setInt(6,customer.getId());
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
        TKCustomerDB db=new TKCustomerDB();
        Customer c=new Customer(27,"name5",20,"lao cai","123123");
        db.getListCustomer();
//        db.updateCustomer(c);
//        db.addCustomer(c);
    }
}
