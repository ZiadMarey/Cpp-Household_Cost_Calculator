import java.util.Comparator;

public class SortByName implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1 == null || person2 == null) {
            System.out.println("The Field is Empty");
            return 0;
        } else {
            return person1.getLastName().compareTo(person2.getLastName());
        }
    }
}
