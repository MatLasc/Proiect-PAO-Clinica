import java.sql.*;

public class DatabaseConfiguration {
    private static final String DB_URL = "jdbc :: mysql/localhost:3306/ReteaMedicala";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection databaseConnection;


    public static Connection getDatabaseConnection(){
        try {
            if (databaseConnection == null || databaseConnection.isClosed())
                databaseConnection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        }
        catch(SQLException e){
                e.printStackTrace();
        }
        return databaseConnection;
    }

    public static void closeConnection(){
        try{
            if(databaseConnection != null && !databaseConnection.isClosed())
                databaseConnection.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

}