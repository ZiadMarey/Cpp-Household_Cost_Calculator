import java.util.Comparator;

public class SortByAge implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) {
        if (person1 == null || person2 == null) {
            System.out.println("The Field is Empty");
            return 0;
        } else {
            return Integer.compare(person1.getAge(), person2.getAge());
        }

    }
}
