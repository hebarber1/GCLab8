import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lab 8 - Calculate batting average and slugging percentage.
 *  
 * @author Herman Barber Java Oct.2017 Bootcamp
 * @version 1.0
 */


public class GCLab8 {

	public static void main(String[] args) {
		
	
		System.out.println("Welcome to Batting Average Calculator!");
		
		//Prompt user for number of at bats	
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		int i = 0;
		int baseErn = 0;
		int sum = 0;
		float slugPer = 0.0f;
		float battAvg = 0.0f;
		
		String answer = "y";
	
		//validate only positive integer
		
				
		while ((answer.equalsIgnoreCase("y"))) {
			
			sum = 0;
			baseErn = 0;
			
			System.out.println("Enter the number of times at bat: ");
			num = scan.nextInt();
			int [] atBats = new int [num];
			
			for (i=0; i<atBats.length; i++) {
				
		
				Scanner scnr = new Scanner(System.in);
				int num1 = 	Validator.getInt(scnr, "Enter bases earned for atBats number " + i + "0=out, 1=single, 2=double, 3=triple, 4=home run", 0,4); 
				atBats[i] = num1;
				sum = num1 + sum ;
				
			}
			
			for (i=0; i<atBats.length; i++) {
				System.out.println("Result for at-bat " + i + ": " + atBats[i]);
			}
			
			for (i=0; i<atBats.length; i++) {
				if (atBats[i]>0) {
					//int baseErn = 0;
					baseErn = baseErn + 1;
				}
				
				}
				
			
				
				
//			System.out.println(baseErn);
			
			battAvg = (float)baseErn/num;
			System.out.println(battAvg);
	
			slugPer = (float)sum/num;
			System.out.println(slugPer);
			
			
			System.out.println("Do you want to enter another player's information(y/n?");
			Scanner scan1 = new Scanner(System.in);
			answer = scan1.nextLine();
	}
			System.out.println("Goodbye");
			}
		



	

}
