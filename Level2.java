public class Level2 {
    public static void main(String a[]) {
        // while loop :
        // int i = 1;
        // while (i <= 5) {
        // System.out.println("i..... =" + i);

        // // Nested Loop
        // int j = 1;
        // while (j <= 2) {
        // System.out.println("j =" + j);
        // j++;
        // }

        // i++;
        // }

        // System.out.println("While Loop Ended");

        // Do While Loop :
        // int x = 1;
        // do {
        // System.out.println("do while " + x);
        // x++;
        // } while (x <= 10);

        // System.out.println("Do while Loop Ended");

        // For Loop :
        for (int i = 1; i <= 5; i++) {
            System.out.println("Day :" + i);

            for (int j = 8; j < 12; j++) {
                System.out.println(j + "AM");
            }
        }

        int y = 1;
        for (; y <= 2;) {
            System.out.println("another method of for loop" + (y + 10));
            y++;
        }

    }
}
