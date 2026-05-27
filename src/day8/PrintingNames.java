package day8;

import java.util.HashMap;

public class PrintingNames {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("ravi",89);
        map.put("ragava",99);
        map.put("raghu",75);
        map.put("rajath",79);
        for(String c  : map.keySet()){
            if(map.get(c) == 99){
               System.out.println(c); 
            }
            
        }
    }
}
