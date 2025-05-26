class Student {
    int rolno;
    String name;
    double gpa;
}

// Array of Objects creation
public class Level5 {
    public static void main(String a[]) {

        Student obj1 = new Student(); // obj1 reference variable
        obj1.rolno = 1;
        obj1.name = "kevin";
        obj1.gpa = 7.30;
        Student obj2 = new Student(); // obj2 reference variable
        obj2.name = "naveen";
        obj2.gpa = 5.30;
        obj2.rolno = 2;
        Student obj3 = new Student(); // obj3 reference variable
        obj3.rolno = 3;
        obj3.name = "frankle";
        obj3.gpa = 4.30;
        Student obj4 = new Student(); // obj4 reference variable
        obj4.rolno = 44;
        obj4.name = "jacob";
        obj4.gpa = 3.30;

        // System.out.println(obj1.name);

        Student std[] = new Student[4];
        // Add values into the array before loop operations

        std[0] = obj1;
        std[1] = obj2;
        std[2] = obj3;
        std[3] = obj4;

        for (int i = 0; i < std.length; i++) {
            System.out.println(" name -" + std[i].name + " roll no -" + std[i].rolno + " GPA -" + std[i].gpa);
        }

        // Enhanced For loop :

        for (Student st : std) {
            System.out.println(" name  " + st.name);
        }
        // String Array using Enhanced For Loop
        String names[] = new String[2];
        names[0] = "a";
        names[1] = "b";

        for (String n : names) {
            System.out.println(n);
        }

    }
}
