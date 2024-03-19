import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    Lock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    public void printThread(){
        System.out.println(Thread.currentThread().getName() + "holds the lock");
    }





    public void collect_car() {


        try {
            try {
                lock.lock();
                notFull.await();
                notFull.signalAll();
                printThread();
            }catch(Exception e){
                System.out.println("Failed");
            }
        } finally {
            lock.unlock();
            }
    }

    public static void main(String[] args) {
        int maxi = 8;
        List<Car> cars = new ArrayList<>();
        Lock lock = new ReentrantLock();
        Condition notFull = lock.newCondition();

        DummyCar dummy = new DummyCar("Audi");

        Thread producer = new Thread(() -> {
            while(true) { // do until thread is terminated
                try {
                    lock.lock();
                    System.out.println("producer entered");
                    try {
                        notFull.await(); // thread waits until notFull.notifyall is triggered,


                        if (cars.size() < 8) {
                            cars.add(new Car());
                        }
                        System.out.println("Producer Left");

                    } catch (Exception e) {
                        System.out.println("producer Failed");
                    }
                }finally {
                        lock.unlock();
                    }


            }
        }
        );
        producer.start();

        Thread consumer = new Thread(() -> {
            while(true){
                try{
                    lock.lock();
                    System.out.println("Consumer Entered");
                    if(cars.size() > 0) {
                        cars.remove(0);
                    }
                    notFull.signalAll(); // every thread that is waiting in the producers, continues
                    System.out.println("Consumer Left");
                }catch(Exception e){
                    System.out.println("consumer Failed");
                } finally{
                    lock.unlock();
                }
            }
        }

        );
        consumer.start();





    }
}
