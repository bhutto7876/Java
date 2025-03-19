
// Real world example of Polymorphism using Payment System
// compile time pol
package Polymorphism;

class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

class PayPal extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using PayPal");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        Payment payment2 = new PayPal();

        payment1.pay();
        payment2.pay();
    }
}
