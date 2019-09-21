import java.util.Scanner;

public class Quickel_p2 {

	public static void main(String[] args) {
		//BMI Calc
		int choice = 0;
		double inches = 0;
		double pounds = 0;
		double meters = 0;
		double kilograms = 0;
		double BMI = 0;
		
		//Select Which Formula
		
		System.out.println("Which Formula Would you like to use to Calculate BMI?");
		while (choice == 0) {
			System.out.print("Type 1 for U.S.  or  Type 2 for Metric: ");
			Scanner scnr = new Scanner(System.in);
			choice = scnr.nextInt();
		
			if (choice != 1 && choice != 2) {
				System.out.println("Not a Valid Answer.");
				choice = 0;
			}
		}
		
		
			//US formula
		if (choice == 1) {
				//Enter Height in inches
			System.out.print("Please enter Hight in 'inches': ");
			Scanner scnr = new Scanner(System.in);
			inches = scnr.nextInt();
			
				//Enter weight in pounds
			System.out.print("Please enter Weight in 'pounds': ");
			pounds = scnr.nextInt();
		
				//Do Math ((703 * pounds) / (inches * inches))
			BMI = ((703 * pounds) / (inches * inches));
			
		}
		
		else if (choice == 2) {
			//Metric Formula
				//Enter Height in meters
			System.out.print("Please enter Hight in 'meters': ");
			Scanner scnr = new Scanner(System.in);
			meters = scnr.nextInt();
			
				//Enter weight in kilograms
			System.out.print("Please enter Weight in 'kilograms': ");
			kilograms = scnr.nextInt();
			
				//Do Math (kilograms / (meters * meters))
			BMI = (kilograms / (meters * meters));
		}
		
		
		//Display BMI
		System.out.println();
		System.out.println("Your BMI is: " + BMI);
		
		//Display BMI Categories
		System.out.println();
		System.out.println("BMI Catagories");
		System.out.println("Underweight =    < 18.5");
		System.out.println("Normal weight =  18.5 - 24.9");
		System.out.println("Overweight =     25 - 29.9");
		System.out.println("Obesity =        >= 30");
		
		

	}

}
