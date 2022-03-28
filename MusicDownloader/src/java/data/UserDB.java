/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import business.User;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NamNguyen
 */
public class UserDB {

    public static void insert(User user, String path) throws IOException {
        File file = new File(path);
        PrintWriter out = new PrintWriter(
                new FileWriter(file, true));
        String content = user.getEmailAddress() + "|" + user.getFirstName() + "|" + user.getLastName() + "|";
        out.println(content);
        out.close();

    }

    public static boolean checkExistEmail(User user, String path) throws IOException {
        File file = new File(path);
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] email=data.split("\\|");
            if(email[0].trim().equalsIgnoreCase(user.getEmailAddress())){
                myReader.close();
                return true;
            }
                
        }
        myReader.close();
        return false;
    }
    
    public static User getUser(String emailAddress,String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] email=data.split("\\|");
            if(emailAddress.equalsIgnoreCase(email[0])){
                User user=new User(email[2],email[1],email[0]);
                return user;
            }
        }
        return null;
    }

}
