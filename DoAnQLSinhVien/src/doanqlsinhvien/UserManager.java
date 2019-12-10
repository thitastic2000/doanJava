/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanqlsinhvien;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dokis
 */
public class UserManager {
    private ArrayList<User>userList;
    
    //Construct

    public UserManager() {
        userList = new ArrayList<>();
    }

    /**
     * @return the userList
     */
    public ArrayList<User> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    
    /**
     * Add function
     * @param user
     */
    public void add(User user)
    {
        userList.add(user);
    }
    
    /**
     * Read file
     */
    public void readfromFile(String filepath)
    {
        ArrayList<User>temp = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            temp = (ArrayList<User>)ois.readObject();
            ois.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error to read file");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Class not found!");
        }
        userList = temp;
    }
    
    /**
     * Save file
     */
    public void exportToFile(String filepath)
    {
        try{
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
            oos.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Can't save file!");
        }
    }
    
    
    /**
     * Log in verify
     */
    public boolean loginVerify(String inputUsername, String inputPassword)
    {
        for(User item : userList)
        {
            if(item.getUserName().equals(inputUsername) && item.getPassWord().equals(inputPassword))
                return true;
        }
        return false;
    }
}
