package reviewclass1;

public class Diplomatask {
	public static void main(String[] args) {
		
		boolean diploma=true;
		
		double gpa= 3.2;
		
		if(diploma) {
			System.out.println("Congratulations!");
			if(gpa>3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
				
			}
		} else {
			System.out.println("Get one to increase income");
		}
		
		System.out.println("------------Mortgage Calc-----------------");

		
		double mortgageRate=1.0;
		double mortgagePrice=2000001;
		boolean userWantsToBuy=true;
		
		if(mortgageRate>4.5) {
			System.out.println("I will not buy a house");
		} else {
			System.out.println("I will consider buying a house");
			if(userWantsToBuy) {
				if(mortgagePrice>2000000) {
					System.out.println("I will take out a loan");
				} else {
					System.out.println("I will buy it cash");
				}
			}else {
				System.out.println("I will not buy a house");
			}
		
		
		
		}
		
		
	}

}
