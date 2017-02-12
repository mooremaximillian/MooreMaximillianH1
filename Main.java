/**
 * This class is used for testing
 */ 
public class Main
{
 public static void main (String[] args)
 {
   // creates new instance of Item class to allow nonstatic testing.
   Item item = new Item();
   // creates new instance of Item class to allow nonstatic testing.
   Food food = new Food();
   
   // Test's getNutrition method
   System.out.println("Nutrition is " + food.getNutrition());
   // Test's the setQuantity method
  food.setQuantity(3); 
    
   // Test's setQuantity method
   System.out.println("Quantity is " + food.getQuantity());
   
   // Test's getWeight method in Food class
   System.out.println("Weight of the food item is " + food.getWeight());
   // test's getWeight method.
   System.out.println("Weight of item is " + item.getWeight());
   //test's getName method.
   System.out.println("Name of item is " + item.getName());
   //test's the examin method.
   item.examine();
 }
 
}