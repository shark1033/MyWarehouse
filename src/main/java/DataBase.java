import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    private static Connection connection;
    private static Statement statement;


    public  DataBase(){
        System.out.printf("Object db is created");
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection=DriverManager.getConnection("jdbc:sqlite:main.db");
        statement=connection.createStatement();

    }


}
