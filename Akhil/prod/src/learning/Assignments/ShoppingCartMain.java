package learning.Assignments;

import java.util.ArrayList;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart sc=new ShoppingCart("shampoo",10,"pantene");
        ShoppingCart sc1=new ShoppingCart("toothpaste",5,"colgate");
        ShoppingCart sc2=new ShoppingCart("mobile",1500,"oneplus");
        ArrayList<ShoppingCart> al=new ArrayList<>();
        al.add(sc);
        al.add(sc1);
        al.add(sc2);
        int total=0;
        for(ShoppingCart s:al){
            total=total+s.cost;
        }
        System.out.println("the total cost of the shopping cart is "+total);

    }
}
