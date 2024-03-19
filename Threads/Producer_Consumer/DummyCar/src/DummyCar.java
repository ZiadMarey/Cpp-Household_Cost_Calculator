import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DummyCar {
    private final String model;
    private int index;


    public DummyCar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "DummyCar{" + "model= " + model + '\'' + '}';
    }








}