package learning.Day24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap();
        m.put(1,"one");
        m.put(2,"two");
        m.put(4,"four");
        m.put(3,"three");



        m.put(5,"five");
        //System.out.println(m);
        m.put(3,"test");
        //System.out.println(m);
        m.put(6,"four");
        m.put(70,"you");
        m.putIfAbsent(2,"duplicate");
        m.putIfAbsent(21,"new");
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.get(4));
        //Set Entryset=m.entrySet();
        //System.out.println(Entryset);

        //generics
        Set<Map.Entry<Integer,String>> Entryset = m.entrySet();


        for (Map.Entry<Integer,String> pair :Entryset){
            System.out.println(pair.getKey()+ "= "  + pair.getValue());
        }




    }
}
