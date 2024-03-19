import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Wazawski","Mike",23,160);
        Person person2 = new Person("John","Bob",19,180);


        List<Person> MyList= new ArrayList<>();
        MyList.add(person1);
        MyList.add(person2);
        MyList.sort(new SortByAge());
        System.out.println("Sorted by Age:" +MyList);
        MyList.sort(new SortByName());
        System.out.println("Sorted by Last Name:" +MyList);
        MyList.sort(person1.Anon); // to call it with the class Person, we have to make the field Anon static in Person.java
        System.out.println("Sorted by First Name:" +MyList);
        MyList.sort(person1.DoubleCompare);
        System.out.println("Sorted by Height:" +MyList);
    }
}
