package javaPrgm;

import java.util.HashMap;
import java.util.Map;

class obj {

    public static void main(String[] args) {


        Map<String, Integer> dMap = new HashMap<String, Integer>();
        dMap.put("A",200);
        dMap.put("AA",1200);
        dMap.put("C",2200);
        dMap.put("D",2300);
        dMap.put("A",2400);

        dMap.put(null,2600);
        dMap.put(null,2800);

        System.out.println(dMap);


    }
}