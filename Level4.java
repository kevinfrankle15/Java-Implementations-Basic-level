public class Level4 {
    public static void main(String a[]) {
        int arrr[] = { 1, 2, 3 };
        int arr1[] = new int[2];

        System.out.println(arrr[0]);
        System.out.println(arr1[0]);

        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }

        // enhanced array :

        // for (int n : arrr) {
        // System.out.print(n);
        // }

        // Multi Dimentional Array :

        int nums[][] = new int[2][4]; // [[1,2,3,4],[5,6,7,8]]

        // adding dynamic values into the mul array :

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10); // Type Casting math.random because its returns in Double type

            }
        }
        // Listing it
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array :

        int jagged[][] = new int[2][]; // jagged array

        jagged[0] = new int[4];
        jagged[1] = new int[2];
        // adding dynamic values into the Jagged mul array :
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = (int) (Math.random() * 10);
            }
        }

        // Enhanced For loop and Listing it

        for (int i[] : jagged) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
