import java.util.Scanner;

public class WorkBonus {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many years have you worked?");
		int yearsWorked=input.nextInt();
		if(yearsWorked>=5) {
			System.out.println("You are eligible, What is your salary");
			int salary=input.nextInt();
			if(salary>50000) {
				System.out.println("Bonus $5000!");
			}else {
				System.out.println("Bonus $3000!");
			}
		}else {
			System.out.println("Sorry, you are not eligible for bonus");
		}
		
		
	}
}
