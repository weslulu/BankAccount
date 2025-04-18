import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class BankAccount extends User{

// instance variable
    private String BankName;
    private String Owner;
    private double balance;

// Constructer 
public BankAccount(String Owner, double balance) {

    this.Owner = Owner;
    this.balance = balance;
    
    }

// Setter And Getter
public BankAccount(double balance) {
        
}

public double getBalance() {
    return balance;
}
public void setBalance(double balance) {
    this.balance = balance;
}


public String getOwner() {
    return Owner;
}

public void setOwner(String owner) {
    Owner = owner;
}
    
   
public String getBankName() {
    return BankName;
}

public void setBankName(String bankName) {
    this.BankName = bankName;
        
}


// Choose the number And Exectute the project
public void ExectuteTheProject() {

// Sava the balance and last balance in arrayList
ArrayList<BankAccount> dataAmount = new ArrayList<BankAccount>();
BankAccount d3 = new BankAccount(balance);

    d3.setBalance(balance);

    System.out.println("\n" + "-------------------Welcome " + this.Owner +"----------------------" + "\n");
    System.out.println("Your current balance is: " + "( " + d3.getBalance() + " SAR" + " )" + "\n");
    dataAmount.add(d3);

    System.out.println("===============================================================================================================");
    System.out.println( "Hello," + "\n" +  "I am the employee " +  getEmployeeNames() + " from " + getBankName() + " Bank" + "\n" + "Please choose the number of the transaction that you want to perform :");
    System.out.println("==============================================================================================================="  + "\n" );


    while (true) {

        Vector<String> option = new Vector<String>();
        option.add("1 - Diposit");
        option.add("2 - Withdraw");
        option.add("3 - infomation My Account");
        option.add("4 - Exit");
    

        System.out.println(option);

        Scanner SelectOption = new Scanner(System.in);
        int choose = SelectOption.nextInt();

    if ( choose == 1 ) {
        

        System.out.println("Please enter the amount you want to add: ");

        Scanner add = new Scanner(System.in);
        int amount = add.nextInt();

        d3.setBalance((d3.getBalance() + amount));
        dataAmount.add(d3);

        System.out.println("Your current balance is this: "  + "( " +  + d3.getBalance()+ " SAR" + " )" + "\n");
    
    } else if ( choose == 2 ) {

        System.out.println("Please enter the amount you want to withdraw: ");

        Scanner withdraw = new Scanner(System.in);
        int amount = withdraw.nextInt();

        d3.setBalance((d3.getBalance() - amount));

            

        System.out.println("Your current balance is this: " + "( " + d3.getBalance()+ " SAR" + " )" + "\n" );

    } else if ( choose == 3 ) {

       for (User d1:data1List) {

        System.out.println("===============================================================================================================");
        System.out.println("Id: " + d1.getID() + "\n" + "password: " + d1.getPassword());
        System.out.println("Your current balance is: " + d3.getBalance() + " SAR");
        System.out.println("===============================================================================================================");

        }

        
    }else if ( choose == 4 ) {
    
        break;

    } else if ( choose >= 5 || choose <= 0 ) {

        System.out.println("We do not have a process with this number ! " + "\n");
    } 
}
}

// Execute The Selection for Owner2
// Choose the number And Exectute the project
public void ExectuteTheProject2() {

    // Sava the balance in arrayList    
    ArrayList<BankAccount> dataAmount = new ArrayList<BankAccount>();
    BankAccount d3 = new BankAccount(balance);
    
        d3.setBalance(balance);
    
        System.out.println("\n" + "-------------------Welcome " + this.Owner +"----------------------" + "\n");
        System.out.println("Your current balance is: " + "( " + d3.getBalance() + " SAR" + " )" + "\n");
        dataAmount.add(d3);

        System.out.println("===============================================================================================================");
        System.out.println( "Hello," + "\n" +  "I am the employee " +  getEmployeeNames() + " from " + getBankName() + " Bank" + "\n" + "Please choose the number of the transaction that you want to perform");
        System.out.println("==============================================================================================================="  + "\n" );
    
        // Repeat the process 
        while (true) {
    
            Vector<String> option = new Vector<String>();
            option.add("1 - Diposit");
            option.add("2 - Withdraw");
            option.add("3 - infomation My Account");
            option.add("4 - Exit");
        
            System.out.println(option);
    
            Scanner SelectOption = new Scanner(System.in);
            int choose = SelectOption.nextInt();
    
        if ( choose == 1 ) {
            
    
            System.out.println("Please enter the amount you want to add: ");
    
            Scanner add = new Scanner(System.in);
            int amount = add.nextInt();
    
            d3.setBalance((d3.getBalance() + amount));
            dataAmount.add(d3);
    
            System.out.println("Your current balance is this: "  + "( " +  + d3.getBalance()+ " SAR" + " )" + "\n");
        
        } else if ( choose == 2 ) {
    
            System.out.println("Please enter the amount you want to withdraw: ");
    
            Scanner withdraw = new Scanner(System.in);
            int amount = withdraw.nextInt();
    
            d3.setBalance((d3.getBalance() - amount));
    
            System.out.println("Your current balance is this: " + "( " + d3.getBalance()+ " SAR" + " )" + "\n" );
    
        } else if ( choose == 3 ) {
    
           for (User d2:data2List) {

            System.out.println("===============================================================================================================");
            System.out.println("Id: " + d2.getID() + "\n" + "password: " + d2.getPassword());
            System.out.println("Your current balance is: " + d3.getBalance()+ " SAR");
            System.out.println("===============================================================================================================");
    
            }
    
            
        }else if ( choose == 4 ) {
        
            break;
    
        } else if ( choose >= 5 || choose <= 0 ) {
    
            System.out.println("We do not have a process with this number ! " + "\n");
        } 
    }
    }

}