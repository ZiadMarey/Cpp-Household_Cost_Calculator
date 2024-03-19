import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Piston piston1 = new Piston();
        piston1.setThickness(1.3);
        Seat seat1 = new Seat(Color.RED);


        try ( var fos = new FileOutputStream("data.xml");
                var oos = new XMLEncoder(fos))
        {
            oos.writeObject(piston1);
        }catch (IOException e){

        }

        Piston piston2 = new Piston();
        try (var fis = new FileInputStream("data.xml");
                var ois = new XMLDecoder(fis)
        ) {
            piston2 = (Piston) ois.readObject();
        } catch (IOException e){

        }

        System.out.println(piston2.getThickness());
    }
}
