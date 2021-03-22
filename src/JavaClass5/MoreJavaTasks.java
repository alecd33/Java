package JavaClass5;

import java.util.Scanner;

public class MoreJavaTasks {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
	
		
		  System.out.println("----------Task 1------------\n");
		  
		  
		  char finalClassGrade=' ';
		  
		  System.out.println("Please enter quiz score: "); int quiz=input.nextInt();
		  
		  System.out.println("Please enter mid term score: "); int
		  midTerm=input.nextInt();
		  
		  System.out.println("Please enter final score: "); int
		  finalGrade=input.nextInt();
		  
		  int average=(quiz+midTerm+finalGrade)/3;
		  
		  
		  
		  if(average>=90) { finalClassGrade='A'; }else if(average>=70 && average<90) {
		  finalClassGrade='B'; }else if(average>=50 && average<70) {
		  finalClassGrade='C'; }else if(average<50){ finalClassGrade='F'; }
		  
		  System.out.println("Your Grade is "+ finalClassGrade);
		  
		  if(finalClassGrade=='A' || finalClassGrade =='B') {
		  System.out.println("I am Happy! :)"); }
		 
		
		//System.out.println("----------Task 1------------\n");
		
		
		
		/*
		 * System.out.println("Enter your birthday month: ");
		 * 
		 * String month=input.next();
		 * 
		 * String season=" ";
		 * 
		 * if(month.equals("January") || month.equals("December")
		 * ||month.equals("February")) { season="Winter";
		 * System.out.println("Your birthday is in the season of "+season); }else
		 * if(month.equals("March") || month.equals("April") ||month.equals("May")) {
		 * season="Spring";
		 * System.out.println("Your birthday is in the season of "+season); }else
		 * if(month.equals("June") || month.equals("July") ||month.equals("August")) {
		 * season="Summer";
		 * System.out.println("Your birthday is in the season of "+season); }else
		 * if(month.equals("September") || month.equals("October")
		 * ||month.equals("November")) { season="Fall";
		 * System.out.println("Your birthday is in the season of "+season); }else {
		 * 
		 * System.out.
		 * println("Please capitalize month,enter a valid month, or check spelling"); }
		 */
		
		
	}
}
