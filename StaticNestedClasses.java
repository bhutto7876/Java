

class Outer {
    static class Nested {
        void show() {
            System.out.println("Inside static nested class");
        }
    }
}

public class StaticNestedClasses {
    public static void main(String[] args) {
        Outer.Nested obj = new Outer.Nested(); // No need for Outer class instance
        obj.show();
    }
}
