import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Exceptions {

    public static void main(String[] args) {
        Boolean isQuit = false;
        Path filepath = null;
        while (isQuit = false) {
            try {
                System.out.println("Please Input the File Path");
                Scanner scan = new Scanner(System.in);
                if (scan.next().equals("quit")) {
                    isQuit = true;
                    return;
                }

                filepath = Path.of(scan.next());
                Files.readString(filepath);
            } catch (InvalidPathException e) {
                System.out.println("File was not found");
            }catch (IOException e){
                System.out.println("IOEXCEPTION?");
            }
        }

    }
}
