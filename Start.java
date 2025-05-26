public class Start {
    public static void main(String arg[]) {
        int a = 10;
        int b = 20;
        int result = a + b;
        String str = "Java";

        // Datatypes

        // integer int(4 bytes) , short(2 bytes) , long(8 bytes) , byte(i byte)
        // range(0-128)
        int i = 1; //
        byte by = 127;
        // float float , double(default)
        float f = 1.2f;
        double db = 1.2;
        // charcter char (accepts only one letter or number)
        char c = 't';
        // Boolean
        boolean bool = true;

        // Type conversion and Casting

        byte byt = 127;
        int in = byt;

        int n = 557;
        byte bt = (byte) n; // if number is grater than 256 it will do -- 557% modulus of 256 called Type
                            // Casting
        float ft = 5.6f;
        int t = (int) ft;

        // Type Promotion

        byte b1 = 10;
        byte b2 = 20;

        int res = b1 + b2;

        // Relational Operators // > ,< ,== ,<= ,>= ,!=
        // == compares references, not content.
        boolean boolResult = b1 > b2;
        // Logical Operator && , || , !

        int w = 10;
        int x = 20;
        int y = 4;
        int z = 6;

        boolean answer = w < x || y > z;

        System.out.println("start coding java");
        System.out.println(result);
        System.out.println(str);

        System.out.println(in);
        System.out.println(bt);
        System.out.println(t);

        System.out.println(res);

        System.out.println(boolResult);

        System.out.println(!answer);
    }
}
