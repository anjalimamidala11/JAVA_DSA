package day7;

public class ArrayIndexOutOfBound1 {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = new int[5];
        try {
            for(int i = 0 ; i<7;i++){
                arr[i] = 2;
                System.out.println(arr[i]);
            }
            System.out.println(9/0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch(){

        }
    }
}
