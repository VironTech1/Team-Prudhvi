package learning.Day24;

import java.util.*;

public class UtilityClassesEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(121,323,424,546,754,353,243,567);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Random random=new Random();
        System.out.println(random.nextInt());
        StringTokenizer stk=new StringTokenizer("hello world"," ",true);
        //String token=stk.nextToken();
        //System.out.println(token);
        while (stk.hasMoreTokens()){//I have used hasMoreElements I got the same output
            String token = stk.nextToken();
            System.out.println(token);
        }

    }
}
