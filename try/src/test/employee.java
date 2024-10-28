package test;

import java.util.HashMap;

public class employee {

    int id;
    String name ;
    HashMap<Integer, employee> hmap = new HashMap<>();

    public employee(int id,String name){
        this.id=id;
        this.name = name;
        this.hmap.put(hmap.size()+1,this);
    }

    public int getID(employee obj){
        return obj.id;
    }
    public String getName(employee obj){
        return obj.name;
    }

    public employee getEmpByEmpID(int searchKey)throws NullPointerException{
        employee obj = null;
        for(Integer eachObj : hmap.keySet()){
            if(hmap.get(eachObj).getID(this)==searchKey)
                obj= hmap.get(eachObj);
        }

        return obj;


    }
    public employee getEmpByName(String searchKey) throws NullPointerException{
        employee obj = null;
        for(Integer eachObj : hmap.keySet()){
            if(hmap.get(eachObj).getName(this)==searchKey)
                return hmap.get(eachObj);
        }
        return obj;
    }


}
