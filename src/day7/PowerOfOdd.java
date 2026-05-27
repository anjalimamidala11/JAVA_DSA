package day7;

import java.util.Scanner;

public class PowerOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if((t&(t-1)) == 0){
                System.out.println("Power of three");
            }else{
                System.out.println("Not Power of three");
            }
        }
    }
}
