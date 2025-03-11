package LowLevelDesign.vamsiPractise.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private static DBConnectionPoolManager dbConnectionPoolManager;
    List<DBConnection> freeConnections = new ArrayList<DBConnection>();
    List<DBConnection> availableConnections = new ArrayList<DBConnection>();
    int INITIAL_CAPACITY = 3;
    int MAXIMUM_CAPACITY = 6;
    public DBConnectionPoolManager() {
        for(int i = 0; i < INITIAL_CAPACITY; i++){
            freeConnections.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance(){
        if(dbConnectionPoolManager == null){
            synchronized (DBConnectionPoolManager.class){
                if(dbConnectionPoolManager == null){
                    dbConnectionPoolManager = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    public synchronized DBConnection getDBConnection(){
        if(freeConnections.isEmpty() && availableConnections.size() < MAXIMUM_CAPACITY){
            freeConnections.add(new DBConnection());
            System.out.println("Creating new Connection and free pool size is " + freeConnections.size());
        }else if(freeConnections.isEmpty() && availableConnections.size() >= MAXIMUM_CAPACITY){
            System.out.println("Cannot create new Connection, max capacity reached");
            return null;
        }
        DBConnection dbConnection = freeConnections. removeLast();
        availableConnections.add(dbConnection);
        System.out.println("Adding new Connection to the used pool " + availableConnections.size());
        return dbConnection;
    }

    public synchronized void releaseConnection(DBConnection dbConnection){
        if(dbConnection != null){
            availableConnections.remove(dbConnection);
            System.out.println("Removing connection from the used pool " + availableConnections.size());
            freeConnections.add(dbConnection);
            System.out.println("Adding new connection to the free pool " + freeConnections.size());
        }
    }
}
