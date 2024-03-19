import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {

        SimpleLinkedList <String> stringList = new SimpleLinkedList<String>();
        stringList.append("hello");
        stringList.append("world");
        stringList.append(stringList.getFirst());

        try(    var fos = new FileOutputStream("data.ser");
                var oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(stringList);
        } catch(FileNotFoundException e){

        }
    }
}
