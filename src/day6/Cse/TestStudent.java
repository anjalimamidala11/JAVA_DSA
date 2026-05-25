package day6.Cse;

import day6.Management.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "student2";

        std1.displayDetails();
        System.out.println(std1.name);

       //System.out.println(std1.amount);//protected
       //System.out.println(std1.subject);//private
       //System.out.println(std1.depaartment);//defalut

    }
}
