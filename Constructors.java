public class Constructors {

    public static void main (String a[]) {
        Human h = new Human();
        Human h1 = new Human("Sohail");
        Human h2 = new Human("Adnam" , 26);
        
        System.out.println("H  "+" Name: " + h.getName()  + " Age: " + h.getAge());
        System.out.println("H1 "+" Name: " + h1.getName() + " Age: " + h1.getAge());
        System.out.println("H2 " +" Name: " + h2.getName() + " Age: " + h2.getAge());
    }
}

class Human {
 private   String name;
 private   int age;

    public Human() {
        name = "Nisar";
        age = 27;
    }

    public Human(String name) {
        this.name = name;
        age = 25;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public int setAge(int age){
        return this.age = age;
    }

    public String getName(){
        return name;
    }       
    public String setName(String name){
        return this.name = name;
    }
}


