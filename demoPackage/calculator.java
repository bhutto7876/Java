
package demoPackage;

public class calculator {
    int a = 10;
    int b = 20;

    protected void add() {
        System.out.println("Sum: " + (this.a + this.b));
    }
}

// public can be accessed from anywhere
// private can only be accessed from within the class
// protected can be accessed from within the package and from outside the
// package but through inheritance
// default can be accessed from within the package only