//Andre Barajas 
//Professor Opkins
//CECS 227
//October 2017
//I/O project (Memento)
//This program simulates an ice creame shop, 
//where a costumer may save his flavor option to a binary file and ultimatley choose.

import java.util.*;
import java.io.*;
public class CareTakerAdvancedIcc extends AdvancedIceCreamCone
{
   
  private ArrayList<AdvancedIceCreamCone> conesSaved = new ArrayList<>();
  /**Default Constructor*/
  public CareTakerAdvancedIcc() {}
  /** Method write an object into a file titled, "iceCreamShop.txt"
   * @param AdvancedIceCreamCone state
   * @param ObjectOutputStream output
   */
  public void saveState(AdvancedIceCreamCone state,  ObjectOutputStream output) throws  IOException
  {
              output.writeObject(state);
  }
  /**Method to read binary file and create a array list from saved AdvancedIceCreamCone object. 
   * @param ObjectInputStream input
   */
  public void generateConesSaved(ObjectInputStream input) throws  IOException, ClassNotFoundException
  {
          try 
          {
              while(true)
              {
                      AdvancedIceCreamCone cone = (AdvancedIceCreamCone)input.readObject();
                      conesSaved.add(cone);
              }
          }
          catch(EOFException ex){ }
  }
  /**Getter method for array lists of AdvancedIceCreamCone
   * @return AdvancedIceCreamCone conesSaved
   */
  public ArrayList<AdvancedIceCreamCone> getConesSaved()
  {
        return conesSaved;
  }
   /**Getter method to return state of saved memento from file data
   * @return AdvancedIceCreamCone x
   */
  public AdvancedIceCreamCone getState(int x) 
  {
        return conesSaved.get(x);
  }
}
