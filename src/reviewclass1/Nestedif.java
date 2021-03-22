package reviewclass1;

public class Nestedif {
	public static void main(String[] args) {
		boolean morning= true;

		boolean classToday= true;

		if (morning) {
			System.out.println("Let me check If i have class");
			if (classToday) {
				System.out.println("I will attend class at Syntax");
			} else {
				System.out.println("I can relax");
			}
		} else {
			System.out.println("Im chilling!");
		}
	}

}
