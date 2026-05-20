// package day2;

public class Fibonacci {
    public static void main(String[] args) {
        int n=0;
        int first = 0 , second = 1;

        System.out.println("Fibonacci Series :");

        for(int i=1;i <= n; i++){
            System.out.println(first + "");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
