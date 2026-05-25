package day3;
import java.util.Arrays;

public class LeftByOne {
    public static void solution(int[] arr) {
        int size = arr.length;

        int temp = arr[0];

        for(int i = 1; i < size ; i++){
            arr[i-1] = arr[i];
        }
        arr[size - 1 ] = temp;
    }   
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        solution(arr);
        System.out.println(Arrays.toString(arr));
            
        
    }
}

