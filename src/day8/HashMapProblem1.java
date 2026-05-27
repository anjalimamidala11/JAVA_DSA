package day8;

import java.util.HashMap;

public class HashMapProblem1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("ravi",89);
        map.put("ragava",99);
        map.put("raghu",75);
        map.put("rajath",79);
        for(String c  : map.keySet()){
            System.out.println(c+ ":" +map.get(c));
        }
    }
}
