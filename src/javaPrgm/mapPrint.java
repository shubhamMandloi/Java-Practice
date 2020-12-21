package javaPrgm;

import java.util.*;

public class mapPrint {
    public static void main(String args[]){
        HashMap<Integer,String> map1= new HashMap<Integer, String>();


        map1.put(1,"Abc");
        map1.put(2,"def");
        map1.put(4,"ghi");
        map1.put(5,"jkl");
       // map1.put(null,"mno");
        map1.put(3,"mno");
        map1.put(4,"gss");

        ArrayList<String> sampleList = new ArrayList<>(map1.values());
        System.out.println("Sample connversaio"
                );
        sampleList.forEach((k)-> System.out.println( k));

    for(Integer i : map1.keySet()){
        System.out.println("The key is : " + i + " and the value is : "+ map1.get(i));

    }

        map1.forEach((k,v)-> System.out.println("key is "+k+" and value is "+v));
        TreeSet<Integer> set1 = new TreeSet<Integer>(map1.keySet());
        System.out.println(set1.first() + " "+ set1.last());
        System.out.println(set1);

        System.out.println("##Tree Map##");



//to get treemap in reverse order and find out min max out of tree map
        TreeMap<Integer,String> tree1= new TreeMap<>(Collections.reverseOrder());

        tree1.put(1,"Abc");
        tree1.put(2,"def");
        tree1.put(4,"ghi");
        tree1.put(5,"jkl");
        tree1.put(4,"jkl");
        tree1.put(3,"mno");
        tree1.forEach((k,v)-> System.out.println("key is "+k+" and value is "+v));
        System.out.println("Lowest Key value is "+ tree1.firstEntry().getKey() +" and value is "+tree1.firstEntry().getValue());
        System.out.println("Highest Key value is "+ tree1.lastEntry().getKey() +" and value is "+tree1.lastEntry().getValue());

    }


}
