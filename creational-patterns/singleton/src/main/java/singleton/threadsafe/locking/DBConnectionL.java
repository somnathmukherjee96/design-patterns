package singleton.threadsafe.locking;

public class DBConnectionL {
    private static DBConnectionL connection;
    private DBConnectionL(){}
    public synchronized static DBConnectionL getInstance(){
        if(connection==null) connection=new DBConnectionL();
        return connection;
    }
}
