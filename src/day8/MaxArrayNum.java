package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// t no.of testcases
//ArrayLIst
//for each array list print max num in the list
public class MaxArrayNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();    // t.no of test cases 
        for(int j = 0;j<t;j++)
        {
        int n = sc.nextInt();   // array list size
        ArrayList<Integer> arr = new ArrayList<>(); // list diclaration
        // for adding multiple valuesss

        for(int i = 0 ; i < n; i++){
            int val = sc.nextInt();
            
            arr.add(val);
        }
        // Collections.sort(arr);
        // System.out.println(arr);
        
        //System.out.println(Collections.min(arr));
        //System.out.println(Collections.max(arr));

        Collections.reverse(arr);
        System.out.println(arr);
        }
    }
}
