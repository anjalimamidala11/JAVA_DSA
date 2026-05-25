package day4.assignment;
import java.util.Scanner;
public class LengthOfString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length  = str.length();

        System.out.println("Length of String is :" +length);
        sc.close();

    }
}
