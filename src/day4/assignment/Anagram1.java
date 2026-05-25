package day4.assignment;

import java.util.Scanner;
import java.util.Arrays;
public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second String : ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
        sc.close();
    }
}
