//Andre Barajas 
//Professor Opkins
//CECS 227
//October 2017
//I/O project (Memento)
//This program simulates an ice creame shop, 
//where a costumer may save his flavor option to a binary file and ultimatley choose.

import java.io.Serializable;
/**
 * Write a description of class MementoAdvancedIcc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MementoAdvancedIcc extends AdvancedIceCreamCone implements Serializable
{
    /**Default Constructor*/
    public MementoAdvancedIcc() {}
    /**method to receive a memento state of ice cream cone.
     *@param AdvancedIceCreameCone state  */
      public void setState(AdvancedIceCreamCone state)
      {
        
        setFlavor(state.getFlavor());
        setTypeOfCone(state.getTypeOfCone());
        addScoops(state.getNumberOfScoops());
          
           for (String  c : state.getToppings())
           {
               addToppings(c);
           }
       }
}



