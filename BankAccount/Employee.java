import java.util.Random;

public class Employee {

// instance variable
    private String EmployeeNames;
    
// Setter and Getter    
public String getEmployeeNames() {
    
    return EmployeeNames;
}

public void setEmployeeNames(String EmployeeNames) {

    this.EmployeeNames = EmployeeNames;

}

// Names The Employee 
public void ListNamesEmployee() {
String[] NameEmployee = {"Mohammed" , "Ahmed" , "Truky" , "faisal" , "Fahad" , "Yousef" , "Qasem" , "Mahmod" , "Fawaz" , "Mazen" , "Hmood" , "fatima"};
        
    setEmployeeNames(NameEmployee[new Random().nextInt(NameEmployee.length)]);
}
}