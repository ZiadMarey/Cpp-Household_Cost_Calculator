import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {


    public Boolean login(String userName, String pwd) throws Exception {


        try (Socket socket = new Socket(InetAddress.getLocalHost(), 8001)) { // 8000 is common for localHost connection
            var is = socket.getInputStream();                                     //a socket is a private part of the connection given in the first parameter, mz end of the connection
            var ois = new ObjectInputStream(is); // now we have an output stream to the socket "connection"

            var os = socket.getOutputStream();
            var oos = new ObjectOutputStream(os);

            oos.writeObject(Actions.LOGIN); // we tell the server that we will now initiate login
            oos.writeObject(userName); // send the username and password
            oos.writeObject(pwd);

            Response result  = (Response) ois.readObject(); // store the response of the server in a variable, we typecast it to response to limit the return of the server
            if(result == Response.SUCCESS){
                return true;
            } else{
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }


    }

    public Boolean register(String userName, String pwd, String firstName, String lastName) throws Exception {

        try(Socket socket = new Socket(InetAddress.getLocalHost(), 8000)){
            var is = socket.getInputStream();
            var ois = new ObjectInputStream(is);

            var os = socket.getOutputStream();
            var oos = new ObjectOutputStream(os);

            oos.writeObject(Actions.REGISTER);
            oos.writeObject(userName);
            oos.writeObject(pwd);
            oos.writeObject(firstName);
            oos.writeObject(lastName);

            Response response = (Response) ois.readObject();

            if(response == Response.SUCCESS){
                return true;
            } else {
                return false;
            }
        }

    }
}
