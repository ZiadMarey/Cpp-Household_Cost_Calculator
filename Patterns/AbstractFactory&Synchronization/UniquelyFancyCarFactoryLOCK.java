import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UniquelyFancyCarFactoryLOCK implements CarPartFactory {

    private static volatile UniquelyFancyCarFactoryLOCK instance = null;
    Lock lock = new ReentrantLock();


    UniquelyFancyCarFactoryLOCK getInstance(){
        if(instance == null){
            try {
                lock.lock();
                if (instance == null) {
                    instance = new UniquelyFancyCarFactoryLOCK();
                }
            }finally {
                lock.unlock();
            }
        }

        return instance;
    }

    @Override
    public Engine buildEngine() {
        Engine uniqueEngine = new UniquelyAwsomeEngine(8,34,4);
        return uniqueEngine;
    }

    @Override
    public Seat buildSeat(Color color) {
        Seat uniqueSeat = new UniquelyAwsomeSeat(color);
        return uniqueSeat;
    }

}
