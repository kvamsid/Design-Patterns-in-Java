package LowLevelDesign.vamsiPractise.ObjectPoolDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection mysqlConnection;
    public DBConnection(){
        try{
            mysqlConnection = DriverManager.getConnection("url", "username", "password");
        }catch(Exception e){
            //
        }
    }
}
