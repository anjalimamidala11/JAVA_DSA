package day7;
import java.util.Scanner;
public class CheckNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<t;i++){
            String str = sc.nextLine();
            boolean found = false;
            for(int j = 0;j<str.length();j++){
                char ch = str.charAt(j);
                if(ch>='0' && ch<='9'){
                    found = true;
                    break;
                }
            }
            System.out.println(found);
        }
    }
}
