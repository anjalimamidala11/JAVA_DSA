//package day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n;
    

    System.out.println("Enter n value :" );
    
    n = sc.nextInt();
    int fact = 1;
    
    for(int i=1; i<=n ; i++){
        fact = fact * i;
    }
    System.out.println("Fact of num  "+n+ " is " +fact);      
    }
}
