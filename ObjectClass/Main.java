package ObjectClass;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alices");
        Person p2 = new Person("Alice");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode()); // 2112
    }
}


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     Person person = (Person) obj;
    //     return name.equals(person.name);
    // }

    // @Override
    // public String toString() {
    //     return "Person{" + "name='" + name + '\'' + '}';
    // }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}