class Student {
    int rollno;
    String name;
    int marks;
}


public class Arrays {
    public static void main (String args[]) {
        // int arr[] = {1, 2, 3};

        // Dynamic array
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

        // Multi dimentional array
        int arr2D[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr2D[i][j] = (int)(Math.random() * 10);    // assigning random values
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // for loop with iterator in c++ // enchanced for loop
        for (int it[] : arr2D) {
            for (int i : it) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Jagged Array => 2d array can have variable size 1d array inside
        int nums[][] = new int[3][];

        // creating variable size 1d array inside 2d array
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);    // assigning random values
            }
        }

        System.out.println();
        for (int it[] : nums) {
            for (int i : it) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // three dimentional array
        // int arr3d[][][] = new int[3][3][3];


        // array of objects
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Pranjal";
        s1.marks = 99;
        
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Aryan";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Hari";
        s3.marks = 77;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + ":" + students[i].marks);
        // }

        // with enchanced for loop 
        for (Student stud : students) {
            System.out.println(stud.name + ": " + stud.marks);
        }
    }
}
