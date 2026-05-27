package day8;
// import java.util.*;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSets {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();
       set.add(1);
       set.add(2);
       set.add(3);
        System.out.println(set);
        LinkedList<Integer> s = new LinkedList<>(set);
        System.out.println(s);
    }
}
