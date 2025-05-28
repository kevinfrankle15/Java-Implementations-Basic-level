// Static Block : A static block in Java is a block of code within a class that is executed only once when the class is first loaded into memory.

class Mobile {
    String brand;
    int price;
    static String name;

    // Constructor used to create default value for istance variables;
    public Mobile() {
        brand = "none";// default value
        price = 0;// default value
        System.err.println("in constructor");
    }

    // static block executes first when the class got called
    static {
        name = "none";// default value
        System.out.println("inside Static ");
    }

    public void display() {
        System.out.println(brand + " " + price + " " + name);
    }
}

public class Level7 {
    public static void main(String a[]) throws ClassNotFoundException {

        // Class.forName("Mobile"); // to call static block

        Mobile obj = new Mobile();
        obj.brand = "Iphone";
        obj.price = 20000;
        Mobile.name = "smart";

        obj.display();

    }
}
