package pkg;
import java.util.*;

public class ShoppingCartItem {
private String itemname = " ";
private double itemCost = 0.0;
private int quantity = 0;


public ShoppingCartItem(double itemCost, int quantity){
    this.itemname = itemname;
    this.itemCost = itemCost;
    this.quantity = quantity;
}
public void cartToString(){
    System.out.print(" You have " + quantity + " and " + itemname + " and they all cost " + itemCost);
}
private String Itemname(){
    return this.itemname;
}
private int getQuantity(){
return quantity;
}
private double getItemcost(){
return itemCost;
}
private double getTotalCost() {
   return this.quantity * this.itemCost;
    
}
private double getTotalWithTax(){
return this.getTotalCost() * 1.12;
}

public double quantityToCostCalculator(int quantity) {
    return itemCost * quantity;
}

public boolean compareItemCost(ShoppingCartItem item2){
 if(this.itemCost < item2.itemCost){
 return true;
 }
 if(this.itemCost > item2.itemCost){
     return false;
 }
}
public ShoppingCartItem copyCart(){
    return this;
}
}