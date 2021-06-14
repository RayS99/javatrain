package javatrain;

public class CalcR {
	/* Calculator Revisited
Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed. */
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	public static double sub(double num1, double num2) {
		return num2 - num2;
	}
	public static double sum(double num1, double num2) {
		return num1 * num2;
	}
	public static double div(double num1, double num2) {
		if(num1 == 0 || num2 == 0) {
			System.out.println("NO DIVIDING BY 0!");
		}
	 return num1 / num2;
	}

}
