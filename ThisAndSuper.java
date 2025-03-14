
// this() and super() are used to call the constructor of the same class and parent class respectively.
// this() and super() should be the first statement in the constructor. If not, it will give a compile-time error.
// If we don't use this() or super() in the constructor, the compiler will automatically insert super() as the first statement in the constructor.
// If we use this() or super() in the constructor, the compiler will not insert super() as the first statement in the constructor.

public class ThisAndSuper {
    public static void main(String[] args) {
        B b = new B(5);
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(int x) {
        this();
        System.out.println("parametrized A");
    }
}

class B extends A {
    public B() {
        super(4);
        System.out.println("B");
    }

    public B(int x) {
        this();
        System.out.println("parametrized B");
    }
}