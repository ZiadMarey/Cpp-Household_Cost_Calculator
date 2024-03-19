import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {


        Lock lock = new ReentrantLock();
        Thread client = new Thread(() -> {

                try{
                    lock.lock();
                    System.out.println("client entered");

                    try{
                        Client client1 = new Client();
                        client1.login("z" , "123");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }finally {
                    lock.unlock();
                }

        });
        client.start();

        Thread server = new Thread(() -> {
            while (true) {
                try {
                    lock.lock();
                    System.out.println("server entered");

                    try{
                        Server server1 = new Server();
                        server1.run();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    lock.unlock();
                }
            }
        });
        server.start();
        }
    }


