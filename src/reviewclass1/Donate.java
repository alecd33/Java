package reviewclass1;

public class Donate {
	public static void main(String[] args) {
		int age=18;
		int weight=90;
		
		if(age>=18) {
			System.out.println("Your old enough");
			if(weight>110) {
				System.out.println("You are of weight and can donate");
			} else {
				System.out.println("but you are not of weight requirements");
			}
		}else {
			System.out.println("Your not old enough");
		}
	}
}
