package copy;

public class MainTest1 {
    // on stack memory
    public static void main(String[] args) {
        // shallow copy / deep copy
        // Primitive / Reference DT

        int a = 10;
        int b = a; // Primitive DT : value copy, a = 10; b = 10;
        b = 100; // a = 10; b = 100;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // person1 = Ref. DT, address copy
        Person person1 = new Person("Hong Gil-dong");
        Person person2 = person1;
        // address copy = shallow copy
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        // person1 & person2 is linked to same object(sharing same link/address),
        // they result same value
        person2.name = "Teemo";
        System.out.println("person1.name = " + person1.name);
        System.out.println("person2.name = " + person2.name);

    } // main
} // class

class Person {
    String name;
    public Person (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
} // Person
