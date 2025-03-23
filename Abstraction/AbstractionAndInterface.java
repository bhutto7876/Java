package Abstraction;

public class AbstractionAndInterface {
    public static void main(String[] args) {
        Animal obj = new dog();
        dog obj1 = (dog) obj;
        obj.makesSound();
        obj.eat();
        obj1.pet();
        obj1.group();
    }
}

abstract class Animal {
    int a = 1; // Abstract class can have fields, but they cannot be abstract
    abstract void makesSound();
    void eat() {
        System.out.println("Eat food");
    }
}

interface pet {
    void pet();
}

 interface Animalgroup {
    void group();    
}

class dog extends Animal implements pet, Animalgroup {
    void makesSound() {
        System.out.println("Dog Barks");
    }

    public void pet() {
        System.out.println("Dog is a pet");
    }
   public void group() {
        System.out.println("Dog is a omnivores group animal");
    }
}
 
