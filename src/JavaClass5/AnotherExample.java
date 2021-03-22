package JavaClass5;

import java.util.Scanner;

public class AnotherExample {
	public static void main(String[] args) {

		/*
		 * Calculate commission based on sales
		 * 
		 * ask user enter sale made based on sales commission: sale between 10 to 100
		 * --> Commission is 10% sale between 101 to 500 --> Commission is 20% sale
		 * between 501 to 1000 --> Commission is 30% More than 1000 --> Commission is
		 * 50%
		 */

		Scanner input = new Scanner(System.in);

		double saleAmount, commission;
		System.out.println("Please enter daily sale amount: ");
		saleAmount = input.nextDouble();

		if (saleAmount < 10) {
			commission = 0;
		} else if (saleAmount >= 10 && saleAmount <= 100) {
			commission = saleAmount * 0.1;
		} else if (saleAmount > 100 && saleAmount <= 500) {
			commission = saleAmount * 0.2;
		} else if (saleAmount > 500 && saleAmount <= 1000) {
			commission = saleAmount * 0.3;
		} else {
			commission = saleAmount * 0.5;
		}
		
		System.out.println("Your daily commission is "+commission);
		
		if(commission>500) {
			System.out.println("You are an amazing selling");
		}
		
	}
}
