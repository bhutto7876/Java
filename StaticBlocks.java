
class Database {
    static {
        System.out.println("Database connection initialized."); // Runs once
    }
}

public class StaticBlocks {
    public static void main(String[] args) {
        Database db1 = new Database();
        Database db2 = new Database();
    }
}
