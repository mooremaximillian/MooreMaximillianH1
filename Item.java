/**
 * This Class describes an items weight and name
 */
public class Item
{
  // name of item
  String name;
  // weight of item
  int weight;
  // Accesor method to get the Name
  public String getName()
  {
    return name;
  }
  // Accessor method to get the weight
  public int getWeight()
  {
    return weight;
  }
  // This method prints a description with name and weight
  public void examine()
  {
   System.out.println("This object's name is " + name + ", and it's weight is " + weight + ",");
                        
  }
  
}