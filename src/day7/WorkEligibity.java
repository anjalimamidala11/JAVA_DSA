package day7;

public class WorkEligibity {
    public static void main(String[] args) {
        int n = 18;
        try {
            if(n > 18){
                throw new ArithmeticException("Eligible for work");
            }
            System.out.println("Not Elegible for work");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
