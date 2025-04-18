public class TestBankAccount {

    // Start the project
    public static void main(String[] args) {

        BankAccount owner1 = new BankAccount("Wesam Lulu", 6300);
        owner1.ListNamesEmployee();
        owner1.setBankName("Alrajhi");
        owner1.signIn1();
        owner1.ExectuteTheProject();
        System.out.println("\n" + "---------------Thank you for dealing with us-------------------- " + "\n");

        BankAccount owner2 = new BankAccount("Eyad Lulu", 5700);
        owner2.ListNamesEmployee();
        owner2.setBankName("Alrajhi");
        owner2.signIn2();
        owner2.ExectuteTheProject2();
        System.out.println("\n" + "----------------------Thank you for dealing with us --------------------------- ");

    }
}