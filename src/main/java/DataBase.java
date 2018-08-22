import java.sql.*;

public class DataBase {

    private static Connection connection;
    private static Statement statement;


    public  DataBase(){
        System.out.println("Object db is created");
    }

    public static void connect() {

        try {
            Class.forName("org.sqlite.JDBC");
            connection=DriverManager.getConnection("jdbc:sqlite:main.db");
            statement=connection.createStatement();
        }  catch (SQLException e) {
            System.out.println("Connection is failed");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error with path");
            e.printStackTrace();
        }finally {
            System.out.println("Disconnected!");
            disconnect();
        }
       // System.out.println("Connected!");

    }

    public static void disconnect(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getFromDB(){ //много перегрузок наверное...пока непонятно...


    }

    private void writeToDB(){


    }

    public void getMakers(){
       // connect();
        System.out.println("Get makers");
        try {
            ResultSet resultSet=statement.executeQuery("SELECT * FROM maker");
            while(resultSet.next()){
                String maker=resultSet.getString(2);
                System.out.println(maker);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}
