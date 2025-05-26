class Calculator {
    int a = 1;

    // public means can be accessed from anywhere inside file
    public int add(int n1, int n2) {
        int output = n1 + n2;
        return output;

        // return n1 + n2;
    }

    // Method Overloading - same method name but differ in parameters

    public long add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int no, String name) {
        System.out.println("Roll Number :" + no + " " + name);
        return no;
    }
}

class Store {
    public void greet() {
        System.out.println("Welcome to the Store!!");
        System.out.println("This Pen Cost 10rps");
    }

    public String buyPen(int cost) {
        int change = 0;
        if (cost == 10) {
            return "Thanks for Buying";
        } else if (cost > 10) {
            change = cost - 10;
            return "Thanks for Buying! take your Balance amount rps :" + change;
        } else {
            return "Amount is less";
        }
    }
}

public class Level3 {
    public static void main(String a[]) {
        // Add 2 Numbers using a class

        int num1 = 10;
        int num2 = 20;
        int result;

        // class calculator :
        Calculator calc = new Calculator(); // cals is an Reference Variable
        result = calc.add(num1, num2);
        System.out.println(result);

        // Method Overloading :

        System.out.println(calc.add(53, "Kevin Frankle"));

        // class store :
        Store obj = new Store();
        obj.greet();
        String pen = obj.buyPen(25);
        System.out.println(pen);

        // task question
        String javaworld = "javaworld"; // stored in string pool

        String java = "java";
        String world = "world";
        String concate = java + world;
        java += world;
        // javaworld and java are same character but diff obj in memory
        // == compares references, not content.
        System.out.println(concate == "javaworld");
        System.out.println(javaworld == java.intern());
        System.out.println(javaworld.equals(java));

    }
}
