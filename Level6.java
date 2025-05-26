
// Static variable & Static method

class Mobile {

    String brand;
    int price;
    static String name; // It belongs to class

    public void get() {
        System.out.println(brand + " " + name + " " + price);
    }

    // Static Method :

    public static void phone(Mobile obj) {
        System.out.println("This is a Static Method");
        // System.out.println(brand + " " + name + " " + price); // only static var can
        // be used inside static method
        System.out.println(Mobile.name + " " + obj.brand + " " + obj.price);

    }

}

public class Level6 {

    public static void main(String a[]) {

        Mobile obj = new Mobile();
        obj.brand = "iphone";
        obj.price = 2000;
        // obj.name = "smartphone"; // getting by class name itself
        Mobile.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "poco";
        obj2.price = 1000;
        // obj2.name = "smartphone2";
        Mobile.name = "smartphone2";

        // obj.name = "sp";
        Mobile.name = "smt phone"; // reflect to every obj because of static

        obj.get();
        obj2.get();

        // executing Static Method :
        // Mobile.phone(); //Run if you no need of any no-static instance var of cls
        Mobile.phone(obj);
        Mobile.phone(obj2);
    }
}
