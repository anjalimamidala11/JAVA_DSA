package day8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
       TreeSet<Integer> set = new TreeSet<>();
       set.add(1);
       set.add(2);
       set.add(3);
        System.out.println(set);
        LinkedList<Integer> s = new LinkedList<>(set);
        System.out.println(s);
    }
}
