package noll_p2;
import java.util.Scanner;

public class BMICalc {

	//calculate body mass index
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Type '1' for BMI calculator in pounds and inches, "
				+ "or '2' for kilograms and meters:");
		int userNum = scnr.nextInt();
		double BMI = 0.0;
		
		if (userNum == 1) {
			System.out.println("Enter your weight, then your height,"
					+ " using decimals if you'd like:");
			double weightInLbs = scnr.nextDouble();
			double heightInInches = scnr.nextDouble();
			//Scanner scnr = new Scanner(System.in);
			BMI = (703 * weightInLbs) / (Math.pow(heightInInches, 2));
		}
			
		if (userNum == 2) {
			System.out.println("Enter your weight, then your height, using decimals:");
			double weightInKilos = scnr.nextDouble();
			double heightInMeters = scnr.nextDouble();
			//Scanner scnr = new Scanner(System.in);
			//$$BMI\:=\:frac{weightInKilos}{heightInMeters^2}$$;
			BMI = weightInKilos / (Math.pow(heightInMeters, 2)); 
		}
		
		System.out.print("Your Body Mass Index is: ");
		System.out.printf("%.1f", BMI);
		System.out.print("\n\n");
		System.out.println("According to the National Heart, Lung, and Blood Institute,"
				+ " BMI categories range from: ");
		System.out.println("Underweight < 18.5");
		System.out.println("18.5 <= Normal Weight <= 24.9");
		System.out.println("25 <= Overweight <= 29.9");
		System.out.println("Obeisity >= 30");
		System.out.println("Source: https://nhlbi.nih.gov/health/educational/lose_wt/BMI/"
			+ "bmicalc.htm");
	}
}
