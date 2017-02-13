/**
 * This class describes a Weapon
 */
public class Weapon extends Item
{
  // name of damage
  private int damage;
 
  
  // Constructor method to initialize damage
  public Weapon()
  {
    damage = 6;
    name = "Sword";
    
  }
  
 // Accesor get's the damage of the Weapon
  public int getDamage()
  {
    return damage;
  }
 
}