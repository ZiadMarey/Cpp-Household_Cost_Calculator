import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;

public class Server {
    private void service(Socket socket, Connection dbConnection ) throws Exception{
        var is = socket.getInputStream();
        var ois = new ObjectInputStream(is);

        var os = socket.getOutputStream();
        var oos = new ObjectOutputStream(os);

        Actions result = (Actions) ois.readObject();

        if(result == Actions.LOGIN){
            String userName = (String)ois.readObject();
            String pwd = (String) ois.readObject();
            DBHelper helper = new DBHelper();
            helper.login(userName,pwd);
        } else if(result == Actions.REGISTER){
            String userName = (String) ois.readObject();
            String pwd = (String) ois.readObject();
            String firstName = (String) ois.readObject();
            String lastName = (String) ois.readObject();
            DBHelper helper = new DBHelper();
            helper.register(userName,pwd,firstName,lastName);
        }
    }
    public void run() throws Exception{
        try(ServerSocket server = new ServerSocket(8001)){
            Connection connection = DriverManager.getConnection("jdbc:sqlite:users-db");

            while(true){
                Socket socket = server.accept();
                service(socket, connection);
                socket.close();

            }
        }
    }
}
