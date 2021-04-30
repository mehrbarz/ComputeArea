package displayRadius;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Enter annual interest rate in percentage
		System.out.println("Enter annual interest rate, eg., 7.25 : ");
		double annualInterestRate = input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200 ; 
		
		// Enter number of years
		System.out.println("Enter number of years as an integer, e.g. , 5: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.println("Enter loan amount e.g. , 1200000.43 : ");
		double loanAmount = input.nextDouble();
		
		//Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate /(1 - 1/Math.pow(1+ monthlyInterestRate, numberOfYears*12));
		double totalPayment = monthlyPayment * numberOfYears * 12 ;
		
		//Display results
		System.out.println("The monthly payment is $ " + (int)(monthlyPayment * 100 / 100.0));
		System.out.println("The total payment is $ "+ (int)(totalPayment * 100 /100.0));
		
		

	}

}
