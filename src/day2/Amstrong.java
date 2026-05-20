package day2;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {

    int n,m,sum,rem;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n value :" );
            
            n = sc.nextInt();
            m = n;
            sum = 0;
            
            while(n>0){
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if(sum == m){
                System.out.println("amstrong of number is : " +sum);
            }   }
    }
}
