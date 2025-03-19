
// Real world example of Polymorphism using Payment System
// compile time pol
package Polymorphism;

class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}



public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new CreditCard();
        payment1.pay();

    }
}
