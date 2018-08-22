import java.util.ArrayList;

public class Departments {

    private int size;
    private int number;
    private String type; //A or B
    private String place; //up or down


    private ArrayList<DataBase> goods; //пока не знаю зачем... тип что хранит отдел наверное

    public void getInfo(){
        //выводим инфу о каждом отделе...
        DataBase dataBase=new DataBase();
        DataBase.connect();


    }


}
