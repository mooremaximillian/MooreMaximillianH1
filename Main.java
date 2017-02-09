/**
 * This class is used for testing
 */ 
public class Main
{
 public static void main (String[] args)
 {
   Item item = new Item();
   System.out.println(item.getWeight());
   System.out.println(item.getName());
   item.examine();
 }
 
}