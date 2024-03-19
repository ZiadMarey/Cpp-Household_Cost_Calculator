public class UniquelyFancyCarFactory implements CarPartFactory{

    public static volatile UniquelyFancyCarFactory instance = null; // it tells the compiler that it will be used by different threads
                                                                    // page 31, if volatile is not used, the compiler translates the left sides directly into the right side, and if multiple threads uses this and the first thread doesn't set interrupted to (true) then there is no chance for other threads to change it.
    private UniquelyFancyCarFactory(){}
    public static UniquelyFancyCarFactory getInstance() {
        if (instance == null) {
            synchronized(UniquelyFancyCarFactory.class) { // if 2 threads want to enter the synchronized block one after the other, and they enter by the same parameter, then 1 thread has to wait until the 1st thread exits the synchronized block for it to enter. However,
                                                    // If we have multiple parameters and 2 threads want to enter but using different parameters, then they can process in parallel no problem.

                if (instance == null) { // if 2 threads enter the synchronized at the same time (not exactly the same time) they will both pass the synchronized block, but the first thread will enter and change the instance first, so we need to ensure that the second thread doesn't make another instance
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
