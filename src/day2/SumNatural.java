// package day2;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n;
    int sum = 0;

    System.out.println("Enter n value :" );
    
    n = sc.nextInt();
    
    for(int i=1; i<=n ; i++){
        sum = sum + i;
    }
    System.out.println("sum of natural numbers are: " +sum);      
    }
}
