import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public final class Person {
    private final String lastName;
    private final String firstName;
    private final int age;
    private final double height;



    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public int getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
     }

    public Person(String lastName, String firstName, int age, double height) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        Objects.requireNonNull(lastName,"Last Name must not be empty"); //these are instead of throwing an exception, it guarantees that the object is not null
        Objects.requireNonNull(firstName,"First Name must not be empty");

        try {

            if (age<=0 || height<=0) {
                throw new IllegalArgumentException();
            }
            if(firstName==null || lastName==null ){
                throw new NullPointerException();
            }

        } catch(IllegalArgumentException e){
            System.out.println("Height and Age must not be equal to or less that zero");
        } catch (NullPointerException e){
            System.out.println("The First and Last Names cannot be left empty");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
    //Anonymous Class
    public Comparator<Person> Anon = new Comparator<Person>() {
        @Override
        public int compare(Person person1, Person person2) {
            if (person1 == null || person2 == null) {
                System.out.println("The Field is Empty");
                return 0;
            } else {
                return person1.firstName.compareTo(person2.firstName);
            }
        }
    };
    Comparator<Person> DoubleCompare = (person1,person2)-> Double.compare(person1.height,person2.height);
}

