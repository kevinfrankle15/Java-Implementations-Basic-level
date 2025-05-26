public class Level1 {
    public static void main(String arg[]) {
        int a = 21;
        int b = 31;
        int c = 30;
        int result = 0;
        if (a > b) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else
            System.out.println(c);

        result = (a < b && b > c) && (a % 2 == 0) ? 10 : 20;
        System.out.println(result);

        // Switch Statements

        String day = "monday";
        String res = "";

        // old tradition way of doing switch :

        // switch (day) {
        // case "monday":
        // System.out.println("6am");
        // break;
        // case "sunday":
        // System.out.println("9am");
        // break;
        // default:
        // System.out.println("7am");
        // }

        // new way of doing switch :

        // switch (day) {
        // case "monday", "tuesday":
        // res = "6am";
        // break;
        // case "sunday":
        // res = "9am";
        // }

        // System.out.println(res);

        // java v17 new way of doing switch --no need of break:

        res = switch (day) {
            case "monday" -> "6am";
            case "sunday" -> "9am";
            default -> "7am";
        };

        System.out.println(res);

        // using yeild insted of break :

        // res = switch (day) {
        // case "monday":
        // yield "6am";
        // case "sunday":
        // yield "9am";
        // default:
        // yield "7am";
        // };

        // System.out.println(res);

    }
}