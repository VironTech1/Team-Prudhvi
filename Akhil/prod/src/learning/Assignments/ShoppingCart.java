package learning.Assignments;

public class ShoppingCart {
    String item_name;
    int cost;
    String Brand;

    ShoppingCart(String item_name,int cost,String Brand){
        this.Brand=Brand;
        this.cost=cost;
        this.item_name=item_name;
    }
    public String toString(){
        return "item name : "+item_name+" cost "+cost+" Brand "+Brand;
    }
}
