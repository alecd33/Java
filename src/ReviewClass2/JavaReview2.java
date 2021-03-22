package ReviewClass2;

import java.util.Scanner;

public class JavaReview2 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		boolean isAllowed=true;
		double accountBalance=1000;
		
		
		
		System.out.println("Please enter your username: ");
		String name=input.next();
		System.out.println("Please enter your password: ");
		String password=input.next();
		
		if(name.equals("Alec")) {
			if(password.equals("Alec123")) {
				System.out.println("Welcome to Syntax Mobile Banking");
				System.out.println("Please enter the amount to transfer:");
				double amountToTransfer=input.nextDouble();
				if(accountBalance>=amountToTransfer) {
					System.out.println("Amount transfered");
				}else {
					System.out.println("Insufficient funds");
				}
				
			}
			else {
				System.out.println("Wrong password");
			}
		}else {
			System.out.println("Wrong username");
		}
	}
}
