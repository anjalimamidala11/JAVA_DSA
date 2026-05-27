package day8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetList {
    public static void main(String[] args) {
        ArrayList<String> emd = new ArrayList<>();
        emd.add("raj");
        emd.add("raha");
        emd.add("raj");        
        LinkedHashSet<String>lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
    }
}
