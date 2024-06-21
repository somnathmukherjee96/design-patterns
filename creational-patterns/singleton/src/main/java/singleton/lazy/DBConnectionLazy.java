package singleton.lazy;

public class DBConnectionLazy {
    private static DBConnectionLazy connection;
    private DBConnectionLazy(){}
    public static DBConnectionLazy getInstance(){
        if(connection==null) connection=new DBConnectionLazy();
        return connection;
    }
}
