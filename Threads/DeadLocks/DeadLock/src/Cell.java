public class Cell {
    private long value;
    public Cell(long value) {
        this.value = value;
    }


    public synchronized long getValue() {
        return value;
    }

    public synchronized void setValue(long value) {
        this.value = value;
    }



    public synchronized void swapValue(Cell other) { // because it is synchronized, when the function is called twice on the same cells like in the main, the cells wait for eachother
        try {
            Thread.sleep(100);
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        long temp = getValue();
        long newValue = other.getValue();
        setValue(newValue);
        other.setValue(temp);
    }


}