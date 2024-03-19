import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecuritySystem {

    private Map<String,SecurityAccessLevel> map = new HashMap<>();
    // get and remove and put functions

    public Collection<EmployeeID> employeeList = new ArrayList<>();



    void addEmployee(EmployeeID employee){
        employeeList.add(employee);
        Address employeeAddress = new Address(1234, "Berlin", "Bismark", 51);
        Birthday birthday = new Birthday(26,Month.JANUARY,2023);
        EmployeeID worker = new EmployeeID("Ziad" , "Marey",birthday,employeeAddress);


    }
    void removeEmployee(EmployeeID employee){
        employeeList.remove(employee);

    }

    Boolean isEmployed(EmployeeID employee){
        int size = employeeList.size();
        for(EmployeeID employeeID: employeeList) {
            return employeeID == employeeList;
        }
    }

    EmployeeID getEmployeeByUID(int UID ){
        int size = employeeList.size();
        for(EmployeeID employeeID: employeeList) {
            if(employeeID == employeeList){
                return employeeID;
            }
        }
    }

}
