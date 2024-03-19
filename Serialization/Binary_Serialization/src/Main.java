import java.io.*;

public class Main {
    public static void main(String[] args) {


        Piston piston1 = new Piston(1.3);
        try{
            var fos = new FileOutputStream("piston.ser");
            var oos = new ObjectOutputStream(fos);
            oos.writeObject(piston1);
            oos.close();
            fos.close();
            System.out.println("Object info Saved");
        } catch(Exception NotSerializableException){
            System.out.println("Object not Serializable");
        }
    }
}
