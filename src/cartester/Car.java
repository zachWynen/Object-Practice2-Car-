/**
 *      SEE MAIN CLASS FOR PROGRAM SUMMARY
 */
package cartester;

public class Car 
{
 //variable declaration   
 String charecs[] = new String[6];
 
 /**
  * This method determines a car's features randomly
  * Pre: The user must have selected this option with a valid input
  * Post: A car object will be assigned one of four random sets of features
  */
 public Car()
 {
  //Random car was selected
  int rand = (int)(Math.random()*3) ;
  
  if(rand == 0)
  {
   charecs[0] = "Lasagnborghini";
   charecs[1] = "Mario";
   charecs[2] = "2016";
   charecs[3] = "24000.50";
   charecs[4] = "true";
   charecs[5] = "32385723";
  }
  else if(rand == 1)
  {
   charecs[0] = "Fusilerrarri";
   charecs[1] = "Garbanzo";
   charecs[2] = "2144";
   charecs[3] = "47314.45";
   charecs[4] = "true";
   charecs[5] = "12";
  }
  else if(rand == 2)
  {
   charecs[0] = "Mozerallati";
   charecs[1] = "Parmesan";
   charecs[2] = "1812";
   charecs[3] = "0.01";
   charecs[4] = "false";
   charecs[5] = "323";
  }
  else if(rand == 3)
  {
   charecs[0] = "Fiatusilli";
   charecs[1] = "Luigi";
   charecs[2] = "10";
   charecs[3] = "4732.33";
   charecs[4] = "true";
   charecs[5] = "240";
  }
 }
 
 
 public Car(String make1, String model1, String year1, String price1)
 {
  charecs[0] = make1;
  charecs[1] = model1;
  charecs[2] = year1;
  charecs[3] = price1;
  
  int rand = (int)(Math.random()*3) ;
  
  if(rand == 0)
  {
   charecs[4] = "true";
   charecs[5] = "32385723";
  }
  else if(rand == 1)
  {
   charecs[4] = "true";
   charecs[5] = "12";
  }
  else if(rand == 2)
  {
   charecs[4] = "false";
   charecs[5] = "323";
  }
  else if(rand == 3)
  {
   charecs[4] = "true";
   charecs[5] = "240";
  }
 }
 
 /**
  * This method determines a car's features based on user input.
  * Pre: The user must have entered Strings of input for each of the characteristics
  * Post: A car object will be assigned all the aforementioned characteristics.
  */
 public Car(String[] characteristics)
 {
  charecs[0] = characteristics[0];
  charecs[1] = characteristics[1];
  charecs[2] = characteristics[2];
  charecs[3] = characteristics[3];
  charecs[4] = characteristics[4];
  charecs[5] = characteristics[5];
 }
   
 /**
  * This method converts the features of a car to an individual String that it returns
  * Pre: All the characteristics must be valid and added to the String array
  * Post: A single String will be returned with the completed output. 
  */
 @Override
 public String toString()
 {
  String ending = "This is your car: ";   
  ending += "\nThe make is: " + charecs[0];   
  ending += "\nThe model is: " + charecs[1];   
  ending += "\nThe year it was made is: " + charecs[2];   
  ending += "\nThe price is: " + charecs[3] + "$";   
  ending += "\nThis car has AC: " + charecs[4] +" statement";   
  ending += "\nThe top speed is: " + charecs[5]+ "km/h\n\n\n";   

  return ending;   
 }
 
 /**
  * This method outputs a quiet honk
  * Pre: It must be reference with a Car object
  * Post: An output of a honk
  */
 public void QuietHornHonk()
 {
  System.out.println("Honk honk!");  
 }
 
 /**
  * This method outputs a loud honk
  * Pre: It must be reference with a Car object
  * Post: An output of a honk
  */
 public void LoudHornHonk()
 {
  System.out.println("HOOOONK!");  
 }
}
