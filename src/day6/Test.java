package day6;

 class P{
    public void m1(){
        System.out.println("m1");
    }
}
class C extends P{
    public void m2(){
        System.out.println("m2");
    }
}
public class Test{
    public static void main(String[] args) {

        //case 1 child can access both child and parent 
        C c1 = new C();
        c1.m1();
        c1.m2();


        //case 2 Parent cannot access child only access parent
        P  p = new P();
        p.m1();
        //p.m2();

        //case3 
        P p1 = new C();
        p1.m1();
        // p1.m2(); CTE

        //case 3 child can access but it cannot store the parent
        // C c1 = new P(); anjali multiplskd
    }
}
