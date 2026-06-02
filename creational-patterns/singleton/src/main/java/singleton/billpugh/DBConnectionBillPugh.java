package singleton.billpugh;

public class DBConnectionBillPugh {
    DBConnectionBillPugh() {
    }

    private static final class Holder {
        private static final DBConnectionBillPugh CONNECTION = new DBConnectionBillPugh();
    }

    public static DBConnectionBillPugh getInstance() {
        return Holder.CONNECTION;
    }
}
