package singleton.threadsafe.doublelocking;

public class DBConnectionDL {
    private static DBConnectionDL connection;
    private DBConnectionDL(){}
    public static DBConnectionDL getInstance(){
        if(connection==null){
            synchronized (DBConnectionDL.class){
                if(connection==null)
                    connection=new DBConnectionDL();
            }
        }return connection;
    }
}
