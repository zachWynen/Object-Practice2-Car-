/**
 *      ZACH WYNEN      ICS4U       OCT 12, 2016
 *      This program uses separate classes and method 
 *      overloading to provide the user with either 
 *      random car information, or information they 
 *      supply through the console.
 */
package cartester;

import java.util.*;

public class CarTester {  
    
    public static void main(String[] args) {
      //Object and variable declaration
      Scanner kb = new Scanner(System.in); 
      String charec[] = new String[6];
      Car car = null;
      String output = "";
      
      //allowing for three separate cars
      for(int select = 0; select<= 2; select++)
      {
       //Prompting for user input   
       System.out.println("If you would like to create a random car, press 1.\n"
       + "If you would like to create your own car, press 2.");
       String choice = kb.next();
       if(choice.equals("1"))
       {
        car = new Car();  
       }
       else if(choice.equals("2"))
       {
        System.out.println("What is the make of your car?");
        charec[0] = kb.next();
        System.out.println("What is the model of your car?");
        charec[1] = kb.next();
        System.out.println("What is the year your car was made?");
        charec[2] = kb.next();
        System.out.println("What is the price of your car?");
        charec[3] = kb.next();
        
        System.out.println("Would you like to input more features? (Y/N)\n(The remaining features will be randomly determined)");
        if((kb.next()).equals("N"))
        {
         car = new Car(charec[0], charec[1], charec[2], charec[3]);   
        }    
        else if((kb.next()).equals("Y"))
        {
         System.out.println("Does your car have air conditioning? (True/False)");
         charec[4] = kb.next();
         System.out.println("What is the top speed of your car?");
         charec[5] = kb.next();
        
         car = new Car(charec);
        }
        else
        {
         System.out.println("Invalid input. The features will be randomly determined.");
         car = new Car(charec[0], charec[1], charec[2], charec[3]);      
        }            
       }
       
       //output organization
       output = car.toString();
       System.out.println(output);
      }
      car.LoudHornHonk();
      car.QuietHornHonk();
    }
}
