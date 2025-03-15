abstract class Animal {
    abstract void makeSound();
    final void eat() {
        System.out.println("Animal Eats");
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.makeSound();
        d.eat();
    }
}

class dog extends Animal {
    void makeSound() {
        System.out.println("Dog constructor");
    }

    // cannot override final method
    // void eat() {
    //     System.out.println("Dog Eats");
    // }
}
