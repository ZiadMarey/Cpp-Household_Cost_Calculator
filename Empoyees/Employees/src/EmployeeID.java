import java.util.Scanner;

public class EmployeeID {

    private static int setUID = 0;
    public String firstName;
    public String lastName;
    private int UID;
    private SecurityAccessLevel accessLevel;
    public Address address; // a variable of type Address that has 4 slots to store 4 different variables defined in the Address class

    public Birthday birthDay;
    public EmployeeID( String firstName, String lastName, Birthday birthDay , Address employeeAddress){
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = employeeAddress;
        this.UID = setUID;
        setUID +=1;
    }


}
