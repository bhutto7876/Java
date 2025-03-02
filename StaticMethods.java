class Utility {
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        int sum = Utility.add(5, 10); // Calling without creating an object
        System.out.println("Sum: " + sum);
    }
}
