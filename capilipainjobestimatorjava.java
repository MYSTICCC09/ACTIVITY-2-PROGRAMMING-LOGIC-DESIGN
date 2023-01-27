package javafundamentals;

import java.util.Scanner;

public class capilipainjobestimatorjava {
    public static void main(String[]args){
	
    	/* SECOND PROGRAMMING EXERCISE8*/
    	/* SUBMITTED BY: ANDREI CAPILI (BSCPE 1-1 - PUP BC)*/ 
    	
    	 Scanner input = new Scanner(System.in);
         int laborTimeHoursInt;
         int laborTimeMinutesInt;
         double wallArea;
         double laborCost;
         double laborTimeMinutesDouble;
         double totalLaborTime;
         double paintGallon;
         double paintCost;
         double paintPrice;
         double totalCost;
         String paintCostString;
         String paintGallonString;
         String laborCostString;
         String totalCostString;
         
         System.out.println("Good day sir Jobert! I'll be your assistant for today");

         System.out.println("Kindly please enter the area of the wall (Square Feet)");
         wallArea = input.nextInt();

         System.out.println("Kindly please enter the price of the paint per gallon (USD)");
         paintPrice = input.nextDouble();

         System.out.println();

         input.close();

         paintGallon = wallArea/115; 
         /* 115sqft : 1 Gallon of Paint */
         
         totalLaborTime = paintGallon*8; 
         /* 1 Gallon of Paint : 8 Hours of Labor */
         
         paintCost = paintGallon*paintPrice; laborCost= totalLaborTime*20; 
         /* 8 Hours of Labor : 20 Dollars */
         
         totalCost = laborCost + paintCost;

         laborTimeHoursInt = (int) totalLaborTime; 
         /* Converting to Int to obtain the whole number or hours only */
         
         laborTimeMinutesDouble = (double) (totalLaborTime - laborTimeHoursInt); 
         /* Subtracting the whole number from the total to obtain minutes */
         
         laborTimeMinutesInt = (int) (60*laborTimeMinutesDouble); 
         /* Converting minutes from decimal form in hours into minutes */

         paintGallonString = String.format("%.02f", paintGallon);
         paintCostString = String.format("%.02f", paintCost);
         laborCostString = String.format("%.02f", laborCost);
         totalCostString = String.format("%.02f", totalCost);

         if(paintGallon == 1){
             System.out.println("Gallons of paint required: " + paintGallonString + " gallon of paint");    
         }else{
             System.out.println("Gallons of paint required: " + paintGallonString + " gallons of paint");
         }
         System.out.print("It will take " + laborTimeHoursInt + " Hours");

         if(laborTimeMinutesInt == 0){
             System.out.println();
         }else{
            System.out.println(" and " + laborTimeMinutesInt + " Minutes");
         }

         System.out.println("Tadah! The paint will cost $" + paintCostString);
         System.out.println("The labor will cost $" + laborCostString + " at a rate of $20 per hour");
         System.out.println("Overall, your total cost equates to: $" + totalCostString);
     }
 }