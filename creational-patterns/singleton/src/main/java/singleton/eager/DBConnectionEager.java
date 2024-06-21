package singleton.eager;

public class DBConnectionEager {
    private static final DBConnectionEager connection = new DBConnectionEager();
    private DBConnectionEager(){}
    public static DBConnectionEager getInstance(){
        return connection;
    }
    public void connect(){
        System.out.println("Connection to db...");
    }
}
