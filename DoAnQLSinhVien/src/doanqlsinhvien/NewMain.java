/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanqlsinhvien;

/**
 *
 * @author dokis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserManager userManager = new UserManager();
        User user1 = new User("admin", "1234");
        User user2 = new User("superadmin", "4567");
        System.out.println(user1.toString());
        userManager.add(user2);
        userManager.add(user1);
       userManager.exportToFile("user.txt");
        
    }
    
}
