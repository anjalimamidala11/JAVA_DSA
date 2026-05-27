package day7;

// public class NullPointerString {
//     public static void main(String[] args) {
//         String s = null;
//         String s1 = "raj";
//         try{
//         if(s.equals(s1)){
//             System.err.println("Equal");
//         }
        
            
//         } catch (Exception e) {
//             System.out.println("Null");// TODO: handle exception
//         }
//     }
// }


// using multiple Catch blocks

public class NullPointerString {
    public static void main(String[] args) {
        try{
        String s = null;
        String s1 = "raj";
        
        if(s.equals(s1)){
            System.out.println("Equal");
        }
        System.out.println(9/0);
            
        } catch (ArithmeticException e) {
            System.out.println("Null");// TODO: handle exception
        }catch(NullPointerException e){
            System.out.println("AE");
        }
    }
}