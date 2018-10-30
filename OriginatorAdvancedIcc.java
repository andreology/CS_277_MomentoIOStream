
//Andre Barajas 
//Professor Opkins
//CECS 227
//October 2017
//I/O project (Memento)
//This program simulates an ice creame shop, 
//where a costumer may save his flavor option to a binary file and ultimatley choose.

 
 
public class OriginatorAdvancedIcc extends AdvancedIceCreamCone
{
  
    
    /**
     * Constructor for objects of class OriginatorAdvancedIcc
     */
    public OriginatorAdvancedIcc(){}
    /**Sets state to for originator 
     * @param AdvancedIceCreamCone state
     */
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
   /**Compute cost depending on flavor taste and include the andre tax. 
    
    */
    public double calculateCost()
    {
           double cost = 0;
           double andreTax = .60;
        if (getFlavor().charAt(0) == 'c')
            {
                cost = ( 30*(getNumberOfScoops())) + ( (30*(getNumberOfScoops()))* andreTax);
            }
            if (getFlavor().charAt(0) == 'v')
            {
                cost = (( 15*(getNumberOfScoops())) + ( 15*(getNumberOfScoops()))* andreTax);
            }
            if (getFlavor().charAt(0) == 's')
            {
                cost = (( 50*(getNumberOfScoops())) + ( 50*(getNumberOfScoops()))* andreTax);
            }
            if (getFlavor().charAt(0) == 'm')
            {
                cost = (( 40*(getNumberOfScoops())) + ( 40*(getNumberOfScoops()))* andreTax);
            }
        
          return cost;
    }
}
