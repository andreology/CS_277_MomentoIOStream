//Andre Barajas 
//Professor Opkins
//CECS 227
//October 2017
//I/O project (Memento)
//This program simulates an ice creame shop, 
//where a costumer may save his flavor option to a binary file and ultimatley choose.

import java.util.*;
import java.io.*;
public class testerAdvancedIcc
{
   
    
    public static void main(String args[]) throws FileNotFoundException, IOException,ClassNotFoundException
    {
              Scanner sc = new Scanner(System.in);
              File textFile = new File("iceCreamShop.txt");
              ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(textFile));
              ObjectInputStream input = new ObjectInputStream(new FileInputStream(textFile));
              AdvancedIceCreamCone userChoice = new AdvancedIceCreamCone();
              AdvancedIceCreamCone originator = new OriginatorAdvancedIcc();
              AdvancedIceCreamCone caretaker = new CareTakerAdvancedIcc();
       
              while (userChoice.getResetValue() == 0)
              {
                   userChoice.mainMenu(sc);
                   userChoice.reset();
                   userChoice.setResetValue(sc.nextInt());
                   originator.setState(userChoice);
                   AdvancedIceCreamCone memento = new MementoAdvancedIcc();
                   memento.setState(originator);
                   caretaker.saveState(memento, output);
                   System.out.println();
              }
               output.close();
       System.out.println();
       caretaker.generateConesSaved(input);
      
      System.out.println("loading saved cones");
      for (int i = 0; i < caretaker.getConesSaved().size(); i++)
      {
            System.out.println("\t\t*****OPTION " + i + "******\t\t");
            System.out.println(caretaker.getState(i).toString());
            System.out.println();
      }
      
      System.out.println();
      System.out.println("Which combination would you like? ");
       originator.setState(caretaker.getState(sc.nextInt()));
       System.out.println();
       System.out.println("Your final Ice Cream cone was... ");
       System.out.println();
       System.out.println(" " + originator.toString());
       System.out.println();
       System.out.println("The final cost for your Ice Cream Cone is $" + originator.calculateCost());
      
       
      
       input.close();
       
    }
    
 
}
