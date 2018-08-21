import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {

    private static Connection connection;
    private Statement statement;


    public  DataBase(){
        System.out.printf("Object db is created");
    }

//    public static void connect(){
//        Class.forName("org.sqlite.JDBC");
//        connection= DriverManager.getConnection("");
//
//    }


}
