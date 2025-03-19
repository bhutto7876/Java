package Packagess;

import demoPackage.calc1;
import demoPackage.calculator;

public class accessModifiers {
    public static void main(String[] args) {
        System.out.println("Hello World");

        advCacl adc = new advCacl();
        adc.multiply();
    }
}

// class advCacl extends calculator {
// }

class advCacl extends calc1 {
    @Override
    protected void multiply() {
        // TODO Auto-generated method stub
        super.multiply();
    }
}
