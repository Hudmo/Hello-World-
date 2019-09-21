package noll_p3;
import java.util.Scanner;

public class RatingSurvey {
	
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = {"programming", "grades     ", "gaming     ", "sports     ",
				"sleeping   "};
		String exitLoop;
		
		int[][] responses = new int[10][5];
		int[] ratingSums = new int[5];
		
		int numUsers = 0;
		int sumResponses = 0;
		int highestRating = 0;
		int lowestRating = 0;
		int numLowRate = 0;
		int numHighRate = 0;
		double avgResponses = 0.0;
		double sumReps = 0.0;
		double numUs = 0.0;
		boolean finish = false;
		int i;
		int j;
		
		for (i = 0; finish == false; ++i) {
			System.out.print("On a scale of 1-10, where 1 is opposed/no opinion");
			System.out.println(" and 10 is proponent, respond to the following queries:");
			System.out.println("What is your opinion on programming?");
			responses[i][0] = scnr.nextInt();
			System.out.println("What is your opinion on grades?");
			responses[i][1] = scnr.nextInt();
			System.out.println("What is your opinion on gaming?");
			responses[i][2] = scnr.nextInt();
			System.out.println("What is your opinion on sports?");
			responses[i][3] = scnr.nextInt();
			System.out.println("What is your opinion on sleeping?");
			responses[i][4] = scnr.nextInt();
			System.out.println("Thank you! Have all users responded? (yes/no)");
			exitLoop = scnr.next();
			if (exitLoop.contentEquals("yes")) {
				finish = true;
			}
			else if (i == 9) {
				finish = true;
			}
			else {
				System.out.println("Continuing on, then!");;
				finish = false;
			}
		}
		numUsers = i;
		System.out.println(numUsers + " people participated in this survey!\n");
		System.out.println(" ---------------------------------------------------"
				+ "------------------------- ");
		System.out.println("|  Topic   | # Ratings |"
				+ "                Ratings                |  Avg rating |");
		System.out.println(" ---------------------------------------------------"
				+ "------------------------- ");
		
		for (j = 0; j < 5; ++j) {
			
			System.out.print(topics[j] + " |    " + numUsers + "    | "); //# ratings
			
			for (i = 0; i </*=*/ numUsers; ++i) {
				
				if (i != numUsers - 1) {
					System.out.print(responses[i][j] + " / ");
				}
				
				else if (i == numUsers - 1) {
					System.out.print(responses[i][j] + " |");
				}
				sumResponses = sumResponses + responses[i][j]; //Totaled inputs for 1 topic(j)
			}
			ratingSums[j] = sumResponses; //ratingsums[topicj] = totaled inputs
			//System.out.println(sumReps + " " + numUs);	 //correct output.
			sumReps = sumResponses;
			numUs = numUsers;
			sumResponses = 0;
			avgResponses = sumReps / numUs;
			//System.out.printf("%.2f", sumReps); //correct output.
			//System.out.printf("%.2f ", numUs); //correct output.
			System.out.printf("    %.2f     |\n", avgResponses);
			System.out.println(" ---------------------------------------------------"
					+ "------------------------- ");
			//System.out.println(".");
			avgResponses = 0.0;
			//numUs = 0.0;
			//sumReps = 0.0;
		}
		/*for (j = 0; j < 5; ++j) {
			System.out.println(ratingSums[j]); correct output.
		}*/
		System.out.print("\n");
		for (j = 0; j < 5; ++j) {
			if (j == 0) {
				highestRating = ratingSums[j];
				//System.out.println(ratingSums[j] + " " + j + " " 
				//+ highestRating); correct outputs.
			}
			else {
				if (ratingSums[j] >= highestRating) {
					highestRating = ratingSums[j];
					//System.out.println(highestRating); //correct output.
					numHighRate = j;
				}
			}
			if (j == 0) {
				lowestRating = ratingSums[j];
			}
			else {
				if (ratingSums[j] <= lowestRating) {
					lowestRating = ratingSums[j];
					//System.out.println(lowestRating); correct output.
					numLowRate = j;
				}
			}
		}
		System.out.println(topics[numHighRate] + " had the highest ratings, totalling at "
		+ highestRating + ".");
		System.out.println(topics[numLowRate] + " had the lowest ratings, totalling at "
		+ lowestRating + ".");
	}//Survey
		/* for (i = 0; i <= numUsers; ++i) {
			for (j = 0; j < 5; ++j) { //up-to-down loops would have been so much easier T-T
				System.out.println(topics[j] + responses[i][j]); 
			}*/
}//main




