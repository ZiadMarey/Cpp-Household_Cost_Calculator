import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Cell cell1 = new Cell(1000);
        Cell cell2 = new Cell(2000);


        Thread thread1 = new Thread(() -> {

                cell1.swapValue(cell2);

        });
        thread1.start();

        Thread thread2 = new Thread(() -> {

                cell2.swapValue(cell1);

        });
        thread2.start();
    }

    // to recognize te deadlock, look at the terminal and there will be no exit status, that means the program is still running
}
