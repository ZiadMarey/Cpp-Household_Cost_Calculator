import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Cell cell1 = new Cell(1000);
        Cell cell2 = new Cell(2000);


        int cellHash1 = System.identityHashCode(cell1);
        int cellHash2 = System.identityHashCode(cell2);

        if(cellHash1 < cellHash2){
            synchronized (cell1){
                synchronized (cell2){
                    cell1.swapValue(cell2);
                }
            }
        }
        if(cellHash2 < cellHash1){
            synchronized (cell2){
                synchronized (cell1){
                    cell2.swapValue(cell1);
                }
            }
        }


    }
}
