// package day2;

import java.util.Scanner;

public class ReverseNum {
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num;
    int reverse = 0;

    System.out.println("Enter n value :" );
    
    num = sc.nextInt();
    
    while(num != 0){
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
    }
    System.out.println("reverse of number is : " +reverse);      
    }
}
