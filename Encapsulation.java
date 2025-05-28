// Making instance variale Private and it can only accessed by the methods inside the same class;

class Human {

    private int age;
    private String name;

    // Setters - Eg : setName
    public void setName(String name) {
        // this keyword will target the instance variable inside the class
        this.name = name;
    }

    // Default Constructor :
    public Human() {
        name = "kevin";
        age = 20;
        System.out.println("in constructor");
    }

    // Parameteraized Constructor :
    public Human(int a, String n) {
        name = n;
        age = a;
    }

    // Setters - Eg: setAge
    public void setAge(int age) {
        // this keyword will target the instance variable inside the class
        this.age = age;
    }

    // Getters -Eg: getName
    public String getName() {
        return name;
    }

    // Getters -Eg: getAge
    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + " : " + age);
    }
}

public class Encapsulation {
    public static void main(String a[]) {
        Human obj = new Human(); // triggers Constructor
        Human obj1 = new Human(21, "vikashni"); // triggers Constructor - Parameteraized
        // Human obj2 = new Human(); // triggers Constructor
        // obj.age=2; // The field Human.age is not visible because its Private :
        System.out.println(obj.getAge() + " : " + obj.getName() + " Before passing  values");
        System.out.println(obj1.getAge() + " : " + obj1.getName() + " Before passing  values  Parameteraized");

        obj.setName("Frankle");
        obj.setAge(23);
        // obj.show();

        System.out.println(obj.getAge() + " : " + obj.getName());

    }
}
