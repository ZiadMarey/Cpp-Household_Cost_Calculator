public class UniquelyFancyCarFactory implements CarPartFactory{

    public static volatile UniquelyFancyCarFactory instance = null; // it tells the compiler that it will be used by different threads
                                                                    // page 31, if volatile is not used, the compiler translates the left sides directly into the right side, and if multiple threads uses this and the first thread doesn't set interrupted to (true) then there is no chance for other threads to change it.
    private UniquelyFancyCarFactory(){}
    public static UniquelyFancyCarFactory getInstance() {
        if (instance == null) {
            synchronized(UniquelyFancyCarFactory.class) { // if 2 threads want to enter the synchronized block one after the other, and they enter by the same parameter, then 1 thread has to wait until the 1st thread exits the synchronized block for it to enter. However,
                                                    // If we have multiple parameters and 2 threads want to enter but using different parameters, then they can process in parallel no problem.
                if (instance == null) { // if 2 threads enter the synchronized at the same time (not exactly the same time) one will pass and create a new instance while the other waits at the synchronized, but the first thread will enter and make the instance first, and the second one will just take the instance created by the first thread
                    instance = new UniquelyFancyCarFactory();
                }
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
