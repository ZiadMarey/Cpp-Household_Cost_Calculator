import java.nio.file.FileAlreadyExistsException;
import java.sql.*;
import java.util.Scanner;

public class DBHelper {
    private Connection connection;
    public static void main(String[] args) throws SQLException {
        DBHelper helper = new DBHelper();

        try {

            helper.initTable();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            helper.closeConnection();
        }

    }
    public void initTable() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:dbname");
        Statement stmt = connection.createStatement();
        String sq = "CREATE TABLE users ("+
                "userNAME STRING," +
                "pwd STRING PRIMARY KEY AUTOINCREMENT," +
                "lastName STRING," +
                "firstName STRING )";
        stmt.executeUpdate(sq);
        System.out.println("Created table");
    }

    public boolean login(String username, String Password) throws SQLException {
        PreparedStatement pstmt = connection.prepareStatement("SELECT pwd FROM users WHERE userName = ?"); //we are searching for a password for the given username
        pstmt.setString(1, username); // enter a username to fill the table
        ResultSet rs = pstmt.executeQuery();
        // resultset represents the table of return values from the data base statement, which is in this case the SELECT
        // executeQuery is used when you're not hanging anything, executeUpdate is used when you're changing something in the database

        if (rs.next()) { // if true, then it means there is another line, until false which means last row of table
            if (rs.getString("pwd").equals(Password)) {
                System.out.println("Login Successful");
                return true;
            } else {
                System.out.println("Login failed");
                return false;
            }
        }
        return false;
    }

    public boolean register(String username, String password, String firstname, String lastname) throws SQLException{
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO users ");
        pstmt.setString(1, username);
        pstmt.setString(2,password);
        pstmt.setString(3,firstname);
        pstmt.setString(4,lastname);
        ResultSet rs = pstmt.executeQuery();

        boolean duplicate = false;
            while (rs.next()){
                if(rs.getString("pwd").equals(password)){

                    duplicate = true;
                }
            }
            if(!duplicate){
                System.out.println("Registration Successful");
                return true;

            } else{
                System.out.println("Registration failed");
                return false;

            }
    }

    public void takeUserPassword(String username, String Password) throws SQLException {

        System.out.println("Please Enter your password");
        Scanner scan = new Scanner(System.in);
        String userPassword = scan.nextLine();
        PreparedStatement pstmt = connection.prepareStatement("SELECT pwd FROM users WHERE username = ?");
        pstmt.setString(2,userPassword);
        pstmt.execute();
    }

    public void insertParameters(String userName, String password, String lastName, String firstName) throws SQLException{
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO users (userName,pwd,lastName,firstName) VALUES (?,?,?,?)");
        pstmt.setString(1, "user1");
        pstmt.setString(2, "pwd1");
        pstmt.setString(3, "lastname1");
        pstmt.setString(4, "firstname1");
        pstmt.execute();
    }
    public void closeConnection() throws SQLException{
        if(connection != null){
            try{
                connection.close();
                System.out.println("Connection closed");
            }catch(SQLException e){
                throw new RuntimeException();
            }
        }
    }
    public boolean checkUserName(String userName)throws SQLException{
        String checking = "SELECT userName FROM users WHERE userName = ?"; // in order to search for the string I gave as a parameter to the function "userName", I need to make an SQL statement as in the insertParameter function

        PreparedStatement pstmt = connection.prepareStatement(checking);
        pstmt.setString(1,userName);
// resultset represents the table of return values from the data base statement, which is in this case the SELECT
        ResultSet rs = pstmt.executeQuery(); // executeQuery is used when you're not hanging anything, executeUpdate is used when you're changing something in the database
        while(rs.next()){
            System.out.println(String.format("UserName: %s, Password: %s, LastName: %s, FirstName: %s ",
                                                rs.getString("userName"),
                                                rs.getString("pwd"),
                                                rs.getString("lastName"),
                                                rs.getString("firstName")));
        }
        return true;
    }
}
