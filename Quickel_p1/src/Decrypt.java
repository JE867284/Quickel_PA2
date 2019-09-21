import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) {
	
		int num;
		int decrypt;
		int holder;
		
		
		//Ask for four digit int
		System.out.print("Please enter four digit integer for Decryption: ");
		Scanner scnr = new Scanner(System.in);
		num = scnr.nextInt();
		
		//Encrypt
		//separate each digit
		
		int num1 = num / 1000 % 10;
		int num2 = num / 100 % 10;
		int num3 = num / 10 % 10;
		int num4 = num % 10;
		
		//add 7 to each
		//find remainder after dividing by 10
		num1 = ((num1 + 10) - 7) % 10;
		num2 = ((num2 + 10) - 7) % 10;
		num3 = ((num3 + 10) - 7) % 10;
		num4 = ((num4 + 10) - 7) % 10;
		
		
		//swap first digit with third
		
		holder = num1;
		num1 = num3;
		num3 = holder;
		
		//swap second digit with fourth
		
		holder = num2;
		num2 = num4;
		num4 = holder;
		
		
		//print encrypted integer
		
		num1 = num1 * 1000;
		num2 = num2 * 100;
		num3 = num3 * 10;
		
		decrypt = num1 + num2 + num3 + num4;
		
		if (decrypt < 1000 && decrypt != 0) {
			
			System.out.println("0" + decrypt);
		}
		else if (decrypt < 100 && decrypt != 0) {
			
			System.out.println("00" + decrypt);
			
		}
		else if (decrypt < 10 && decrypt != 0) {
			
			System.out.println("000" + decrypt);
			
		}
		else if (decrypt == 0) {
			
			System.out.println("0000");
			
		}
		
		else {
		
			System.out.println(decrypt);
		}
	}
}
