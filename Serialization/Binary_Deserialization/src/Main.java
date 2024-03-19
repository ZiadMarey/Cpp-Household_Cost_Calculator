import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) {

        Piston piston1 = null;

        try{
            var fis = new FileInputStream("piston.ser");
            var ois = new ObjectInputStream(fis);
            piston1 = (Piston) ois.readObject();
        } catch (FileNotFoundException e){
            System.out.println("Error e");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(piston1.getThickness());
    }
}
