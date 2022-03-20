/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NamNguyen
 */
public class User {

    private String firstName, lastName, emailAddress;
    private List<String> list=new ArrayList<>();
    public User() {
        firstName = "";
        lastName = "";
        emailAddress = "";
    }

    public User(String firstName, String lastName, String emailAddress, List<String> arr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.list=arr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    
}
