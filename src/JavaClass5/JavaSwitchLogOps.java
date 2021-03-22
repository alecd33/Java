package JavaClass5;

import java.util.Scanner;

public class JavaSwitchLogOps {

	public static void main(String[] args) {
		
		/*
		 * ask the user to enter age
		 * based on the age we will define 
		 * if age is from 1 to 3 ---> you are baby
		 * if age is from 3 to 5 ---> you are bigger baby
		 * if age is from 5 to 12 ---> you are a kid
		 * if age is from 13-19 --> teenager
		 * if age is above 20---> you are an adult
		 * 
		 */
		
		Scanner input=new Scanner(System.in);
		String Name;
		
		System.out.println("Please enter you name: ");
		String name=input.next();
		
		System.out.println("Please enter your age: ");
		int age=input.nextInt();
		if(age<=0) {
			System.out.println("You are not born yet?!");
		} else if(age>=1 && age<3) {
			System.out.println(name+" you are a baby");
		}else if(age>=3 && age<=5) {
			System.out.println(name+" you are a bigger baby");
		}else if(age>5 && age<=12) {
			System.out.println(name+" you are a kid");
		}else if(age>=13 && age<=19) {
			System.out.println(name+" you are a teenage");
		}else if(age>=20) {
			System.out.println(name+" you are a adult");
		}
		
		/*
		 * we have to identify if number is small,medium,large, xlarge if number between
		 * 1 and 10 --> small if number between 11 and 100 --> medium if number between
		 * 101 and 1000 --> large if number between 1001 and 100000 --> xlarge
		 */
		/*System.out.println("------------logical operators--------");
		System.out.println("&& And");
		int num = 100;

		if (num >= 1 && num <= 10) {

			System.out.println(num + " is a small number");

		} else if (num >= 11 && num <= 100) {

			System.out.println(num + " is a medium number");

		} else if (num >= 101 && num <= 1000) {

			System.out.println(num + " is a larg number");

		} else if (num >= 1001 && num <= 100000) {

			System.out.println(num + " is a xlarge number");

		}*/
		
		//System.out.println("Or ||");
		
		/*Variable Day
		 * 
		 * if day is Tues or Weds--->Manual CLasss
		 * if day is Mon or Friday---> no class
		 * if day is thurs---> review class
		 */
		
		/*
		
		String day="Tuesday";
		
		if(day.equals("Monday")  || day.equals("Friday")) {
			
			System.out.println("Today I have class");
			
		} else if (day.equals("Tuesday")  || day.equals("Wednesday")) {
			
			System.out.println("Today I have Manual class");
			
		}else if(day.equals("Thursday")){
			
			System.out.println("Today I have review class");
			
		}else if (day.equals("Saturday")  || day.equals("Sunday")) {
			
			System.out.println("Today I have JAVA class");
			
		}else {
			
			System.out.println(day+" is invalid");
			
		}*/
		
		
		
	}

}
