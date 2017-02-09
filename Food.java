/**
 * This class creates a food item
 */ 
public class Food extends Item
{
  // 
 private int nutrition;
 // The amount of food
 private int quantity;
 // Accesor method to get the nutrition
 public int getNutrition()
 {
   return nutrition;
 }
 // Accesor method to get the quantity
 public int getQuantity()
 {
   return nutrition;
 }
 //Mutator method to set the quantity
 public void setQuantity(int newAmount)
 {
   quantity = newAmount;
 }
 //Accesor method to get the weight including the quantity
 public int getWeight()
 {
   return weight * quantity;
 }
}