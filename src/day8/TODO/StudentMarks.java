// package day8.TODO;

// import java.util.ArrayList;
// import java.util.Scanner;

// public class StudentMarks {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();
//         for(int i = 0;i<t;i++){
//             int n = sc.nextInt();
//             ArrayList<Integer> arr = new ArrayList<>();
//             int sum = 0;
//             for(int j = 0;j<n;j++){
//             int marks = sc.nextInt();
//             arr.add(marks);
//             sum = sum + marks;
//             }
//             double avg = (double) sum/n;
//             System.out.println("marks: " +arr);
//             System.out.println("avg: " +avg);

//         }
//     }
// }


package day8.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int j = 0;j<t;j++){
            // int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            // int sum = 0;
            for(int i = 0;i<5;i++){
            int submarks = sc.nextInt();
            arr.add(submarks);
            // sum = sum + marks;
            }int sum= 0;
            for(int c : arr){
                sum += c;
            }
            double avg = (double) sum/5;
            
            System.out.println(j+1 +"avg: " +avg);

        }
    }
}