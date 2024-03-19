import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    public <T> Set<T> union (Set<T>...sets){
        Set<T> sum = new HashSet<>();
        for (Set<T> set: sets) {
            for(T characters: set){
                sum.add(characters);
            }
        }
        return sum;

    }
    public <T> Set<T> intersection (Set<T>...sets){
        Set<T> firstSet = sets[0];
        for(T element: firstSet)
            for (Set<T> set: sets) {
                if(element = sets){
                    firstSet.remove(element);
                }
            }
        return firstSet;
    }

}
