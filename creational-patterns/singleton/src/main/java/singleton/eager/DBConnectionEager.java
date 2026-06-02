package singleton.eager;

public class DBConnectionEager {
    private static final DBConnectionEager CONNECTION = new DBConnectionEager();

    private DBConnectionEager() {
    }

    public static DBConnectionEager getInstance() {
        return CONNECTION;
    }

    public void connect() {
        System.out.println("Connection to db...");
    }
}
