/**
 * This class is used for testing
 */ 
public class Main
{
 public static void main (String[] args)
 {
   // creates new instance of Item class to allow nonstatic testing.
   Item item = new Item();
   // creates new instance of Food class to allow nonstatic testing.
   Food food = new Food();
   // creates new instance of Weapon class to allow nonstatic testing.
   Weapon weapon = new Weapon();
   // creates new instance of Armor class to allow nonstatic testing.
   Armor armor = new Armor();
   //Test's the weapon method
   weapon.examine();
    // Test's the setQuantity method
  food.setQuantity(3);
   //Test's the examine method for the food class
   food.examine();
   
   //Test's getDefense method
   System.out.println("Defense is " + armor.getDefense());
   
   //Test's getDamage method
   System.out.println("Damage is " + weapon.getDamage());
   
   
   // Test's getNutrition method
   System.out.println("Nutrition is " + food.getNutrition());
   
    
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