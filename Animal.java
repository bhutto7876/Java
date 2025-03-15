final class Animal {
  final void  makeSound() {
        System.out.println("Animal constructor");
    }
    public static void main(String[] args) {
        dog d = new dog();
    }     
}

// the dog class can't subclass the Animal class because it is final
class dog extends Animal {
// cannot override final method from Animal
    // void makeSound() {
    //     System.out.println("Dog constructor");
    // }
}
