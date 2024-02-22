//day 17 assignemnt

package learning.Day17;

import java.util.Scanner;

public class Stringex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your String :");
        String s=sc.nextLine();//not giving the required output when user gives the input
        //String s="akhil reddy nagulaplly";
        System.out.println(s);
         s=s.trim();
        System.out.println(s);
        char q=s.charAt(0);
        int i=s.length();
        char[] a=s.toCharArray();
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println("'"+a[0]+"'");
       /* System.out.println("enter the index number to search for the char");
        int index=sc.nextInt();
        System.out.println("enter the character");
        String ft=sc.next();

        int index1 = index;
        if(ft.equals(a[index1])){
            System.out.println("found the character at given index");
        }

        */
        //char[ ] array=[];


        //splittting the string

        String[] arraystr= s.split(" ");
        int l= arraystr.length;
        for(int y=0;y<l;y++){
            System.out.println(arraystr[y]);
        }
        System.out.println(l);
        //let the given string to be searched for be 'reddy'
        String str="reddy";
        for(int u=0;u<l;u++){
            if(str.equals(arraystr[u])){
                System.out.println("found the string '"+str+"' it is in the index "+u);
            }

        }






        String st ="";

        //reverse of a string
        for(int j=(i-1);j>=0;j--){
            st=st+s.charAt(j);
        }
        System.out.println("the reverse of the string given is :"+st);
        System.out.println("the length of reversed string is "+st.length());
        System.out.println(st.equals(s));
        if(st.equals(s)){//string palindrum//but when i do if(st==s) it doesn't work
            System.out.println("the given string is palindrum ");
        }

        //checking for a character at the given index
        System.out.println("enther the index : ");
        int r=sc.nextInt();
        System.out.println("enter the character ");
        char c2=sc.next().charAt(0);

        if(c2 == a[r]){
            System.out.println("THe characters are equal");
        } else if (true) {



        }












        /*System.out.println();
        String S=s.concat(" reddy");
        System.out.println(q);
        System.out.println(S);

        System.out.println(i);
        System.out.println(s.getBytes());

         */

    }
}
