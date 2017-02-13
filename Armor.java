/**
 * This class describes an Armor item
 */ 
public class Armor extends Item
{
  //Declares an int defense
  private int defense;
 //Accesor method to get defense.
  // Constructor method to initialize defense
  public Armor()
  {
    defense = 4;
  }
  // Accesor method to get amount of defense
  public int getDefense()
  {
    return defense;
  }
  
}