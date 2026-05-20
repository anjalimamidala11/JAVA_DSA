package day2;

import java.util.Scanner;

public class CheckAmstrong {
    public static boolean solution(int num) {
        int temp = num;
        int count = 0;

        while(temp != 0)
        {
            count ++;
            temp = temp / 10;
        }

        temp = num;
        double result = 0;
        while (temp != 0){
            int digit = temp % 10;
            result = result + Math.pow(digit, count);
            temp /= 10;
        }
        System.err.println(result +""+num);
        return result == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(solution(num)){
            System.err.println("This is a Amstrong number");
        }else{
            System.out.println("not an amdtrong number");
        }
    }
}
