/* This class is used to model the properties and behaviors of an ice cream cone.
   There are currently restriction on the construction of the cone: only one
   flavor of ice cream is allowed. */
import java.util.*;
import java.io.Serializable;
import java.io.*;
public class AdvancedIceCreamCone implements Serializable
{
    private int numberOfScoops;
    private String flavor;
    private String typeOfCone;
    private ArrayList<String> toppings = new ArrayList<String>();
    private int coneType0;
    private int flavorType0;
    private int scoopAmount0;
    private int addToppings0;
    private int resetValue =0;
    private String coneType1;
    private String flavorType1;
    private String addToppings1;
    private int ChC = 0;
    private int VaC = 0;
    private int MimiC = 0;
    private int StrC = 0;
   
   
   
//the default constructor creates a one scoop, vanilla ice cream cone using the regular type of cone and no toppings
    public AdvancedIceCreamCone() 
    {
        numberOfScoops=1;
        flavor="vanilla";
        typeOfCone="regular";
    }
/*this constructor lets you create an ice cream code to your liking. It takes in three parameters:
  the number of scoops, the flavor of the ice cream and the type of cone */
    public AdvancedIceCreamCone(int ns,String flv,String cone) 
    {
        numberOfScoops=ns;
        flavor=flv;
        typeOfCone=cone;
    }
    public void mainMenu(Scanner sc)
    {
         

              pickConetype();
              coneType0 = sc.nextInt();
              pickFlavortype();
              flavorType0 = sc.nextInt();
              pickScoopamount();
              scoopAmount0 = sc.nextInt();
              pickToppingtype();
               addToppings0 = sc.nextInt();
               checkChosenFlavors();
              
            if (coneType0 == 0) { coneType1 = "regular";}
            else if (coneType0 == 1) { coneType1 = "sugar";}
            else if (coneType0 == 2) {coneType1 = "waffle";}
            if (scoopAmount0 == 0) { addScoops(1);}
            else if (scoopAmount0 == 1){ addScoops(2);}
            else if (scoopAmount0 == 2){ addScoops(3);}
            
            if (addToppings0 == 0) { addToppings1 = "Cherry bits";}
            else if (addToppings0 == 1) { addToppings1 = "Choclate bits";}
            else if (addToppings0 == 2) {addToppings1 = "Pineapple bits";}
            else if (addToppings0 == 3) {addToppings1 = "Carrot bits";}
            setFlavor(flavorType1);
         setTypeOfCone(coneType1);
         addToppings(addToppings1);
            
        if ( (StrC == 1) && (MimiC == 1) && (VaC == 1) && (ChC == 1))
         { 
             System.out.println();
             System.out.println("You've exausted all flavor options, please select 1 next... ");
             System.out.println();
             return;
        }
         
          if ( (ChC > 1 && resetValue == 1) || ChC > 1)
          {
              error();
              ChC--;
              mainMenu(sc);
          
          }
          if ( (VaC > 1 && resetValue == 1) || VaC > 1)
          {
                 error();
              VaC--;
              mainMenu(sc);
          
          }
          if ( (MimiC > 1 && resetValue == 1) || MimiC > 1)
          {
                  error();
                  MimiC--;
                  mainMenu(sc);
          
          }
          if (  (StrC > 1 && resetValue == 1) || StrC > 1)
          {
                error();
                 StrC--;
                 mainMenu(sc);
          }
         
           
         
    
    }
    public void checkChosenFlavors()
    {
        if (flavorType0 == 0)
            { 
                flavorType1 = "choclate";
                ChC++; 
            }
            else if (flavorType0 == 1) 
            {
                flavorType1 = "vanilla";
                VaC++;
            }
            else if (flavorType0 == 2) 
            {
                flavorType1 = "strawberry";
                StrC++;
            }
             else if (flavorType0 == 3)
            {
                 flavorType1 = "mimi's minty";
                 MimiC++;
            }
    }
    public double calculateCost()
    {
           double cost = 0;
           
                 return cost;
    }
    public void error()
    {
      System.out.println("You've already chosen this flavor, please choose another... ");  
    }
    public int getResetValue()
    {
      return resetValue;  
    } 
    public void setResetValue(int x)
    {
      this.resetValue = x;  
    } 
    //this method returns the number of scoops in the cone
    public int getNumberOfScoops () 
    {
        return numberOfScoops;
    }
    //this method returns the ice cream flavor
    public String getFlavor() {
        return flavor;
    }
    //this method returns the type of cone
    public String getTypeOfCone() {
        return typeOfCone;
    }
    //this method allows you to add one scoop of ice cream at a time
    public void addScoops(int x) {
        numberOfScoops = x;
    }
    //this method allows you to change the ice cream flavor
    public void setFlavor(String flv) {
            flavor=flv;
    }
    //this method allows you to change the type of cone
    public void setTypeOfCone(String cone) {
        typeOfCone=cone;
    }
    //this method allows you to add  toppings
    public void addToppings(String top) {
             for (int x = 0; x < getToppings().size(); x++)
             {
                 getToppings().remove(x);
             }
             toppings.add(top);
    }

    //this method returns a String with a list of the toppings
    public ArrayList<String> getToppings () {
        return toppings;
    }

    //this method overrides the inherited toString()
    public String toString() {
        return ("The number of scoops is " + numberOfScoops + ".\n The flavor is " +
          flavor + ".\n The type of cone is " + typeOfCone + "\n The toppings are: " + getToppings());
      }
   
    public void pickConetype()
    {
      System.out.println("\t\t******Pick a Cone******\t\t");
      System.out.println("0. Regular");
      System.out.println("1. Sugar");
      System.out.println("2. Waffle");
    }
    public void pickFlavortype()
    {
      System.out.println("\t\t******Pick a Flavor******\t\t");
      System.out.println("0. Chocolate");
      System.out.println("1. Vanilla");
      System.out.println("2. Strawberry");
      System.out.println("3. Mimi's Minty");
      
    }
    public  void pickScoopamount()
    {
      System.out.println("\t\t******Pick a Scoop Amount******\t\t");
      System.out.println("0. One");
      System.out.println("1. Two");
      System.out.println("2. Three");
    }
    public  void pickToppingtype()
    {
      System.out.println("\t\t******Pick a Topping******\t\t");
      System.out.println("0. Cherry bits");
      System.out.println("1. Choclate bits");
      System.out.println("2. Pineapple bits");
      System.out.println("3. Carrot bits");
      System.out.println("4. CHANGE FLAVORS");
      
    }
    public void reset()
    {
          System.out.println("\t****Satisfied?****\t");
          System.out.println("0. CHANGE FLAVORS");
          System.out.println("1. yes");
    }
   public void setState(AdvancedIceCreamCone state){ }
   public void createMemory(){ }
   public void saveState(AdvancedIceCreamCone state, ObjectOutputStream output) throws  IOException{}
   public AdvancedIceCreamCone getState(int x) 
   {
      AdvancedIceCreamCone s = new AdvancedIceCreamCone();
      return s;
   }
   public void getStateFromMemento(MementoAdvancedIcc memento){}
   public ArrayList<AdvancedIceCreamCone> getConesSaved()
   {
        ArrayList<AdvancedIceCreamCone> conesSaved = new ArrayList<>();
        return (conesSaved); 
   }
    public void generateConesSaved(ObjectInputStream input)throws  IOException, ClassNotFoundException{}
}