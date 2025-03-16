public class MethodOverRiding {
public static void main(String[] args) {    
Dog d = new Dog();
d.barks();
}
    }

class Animal {
    void barks (){
        System.out.println("Animal barks");
    }
}


class Dog extends Animal {
    void barks (){
        System.out.println("Dog barks");
    }
}