// Anonymous object  

class A {
    public void show() {
        System.out.println("Anonymous");
    }
}

public class Level8 {
    public static void main(String a[]) {
        new A(); // Anonymous object - nameless
        new A().show();
    }
}
