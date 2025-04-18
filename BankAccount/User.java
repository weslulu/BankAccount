import java.util.Scanner;
import java.util.ArrayList;

public class User extends Employee {

// instance variable
    private String NationalID;
    private String Password;

// arrayList for save data
    public static ArrayList<User> data1List = new ArrayList<User>();
    public static ArrayList<User> data2List = new ArrayList<User>();
    
// Setter And Getter
    public String getID() {
        return NationalID;
    }

    public void setID(String i) {
        NationalID = i;
    }

    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String p) {
        this.Password = p;
    }

// this method for Sign in and save data in ArrayList
    public void signIn1() {

        Scanner owner1 = new Scanner(System.in);
    
        System.out.println("Please Give Me Your Id National: ");
        NationalID = owner1.nextLine();
    
        System.out.println("Please Give Me Your Password: ");
        Password = owner1.nextLine();
    
        User d1 = new User();
        d1.setID(NationalID);
        d1.setPassword(Password);
    
        data1List.add(d1);
    }

    public void  signIn2() {

        Scanner owner2 = new Scanner(System.in);
    
        System.out.println("Please Give Me Your Id National: ");
        NationalID = owner2.nextLine();
    
        System.out.println("Please Give Me Your Password: ");
        Password = owner2.nextLine();
    
        User d2 = new User();
        d2.setID(NationalID);
        d2.setPassword(Password);
    
        data2List.add(d2);

    }
}