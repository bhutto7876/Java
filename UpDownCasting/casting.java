package UpDownCasting;



public class casting {

    public static void main (String []args){

        casting  cast =  new casting();
        // cast.show();    // This is casting class
        // cast.show1(); // Error: cannot find symbol   symbol: method show1()
   
    subCasting subCast = (subCasting) cast;
    // subCast.show1(); // This is subCasting class
    subCast.show(); 


    // incorrect way of casting not knowing the type of object
    Animal myAnimal = new Cat(); // Upcasting (Cat to Animal)
        
    Dog myDog = (Dog) myAnimal; // ❌ Incorrect downcasting
    myDog.bark(); // ❌ Runtime error (ClassCastException)
    
    }

    void show () {
        System.out.println("This is casting class");
    }
    
}

class subCasting extends casting {
    void show1 () {
        System.out.println("This is subCasting class");
    }
}


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

