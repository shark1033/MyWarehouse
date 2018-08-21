import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        DataBase dataBase=new DataBase();
        try {
            dataBase.connect();
        } catch (ClassNotFoundException e) {
            System.out.println("Error with path");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection is failed");
            e.printStackTrace();
        }
    }










}
