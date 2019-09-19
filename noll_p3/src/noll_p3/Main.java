package noll_p3;
import java.util.Scanner;

public class Main {
	
	
	public static void Survey (String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = {"programming", "grades", "gaming", "sports", "sleeping"};
		String exitLoop;
		
		int[][] responses = new int[10][5];
		int[] ratingSums = new int[5];
		
		int numUsers = 0;
		int avgResponses = 0;
		int highestRating = 0;
		int lowestRating = 0;
		int numLowRate = 0;
		int numHighRate = 0;
		
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
			System.out.print("Thank you! Have all users responded? (yes/no)");
			exitLoop = scnr.next();
			if (exitLoop.contentEquals("yes")) {
				finish = true;
			}
			else {
				System.out.println("Continuing on, then!");;
				finish = false;
			}
		}
		numUsers = i;
		System.out.println(numUsers + " people participated in this survey!");
		
		for (j = 0; j < 5; ++j) {
			
			System.out.print(topics[j] + ", " + numUsers + "ratings: ");
			
			for (i = 0; i <= numUsers; ++i) {
				
				if (i != numUsers) {
					System.out.print(responses[i][j] + ", ");
				}
				
				else if (i == numUsers) {
					System.out.print(responses[i][j] + "; ");
				}
				avgResponses = avgResponses + responses[i][j];
			}
			ratingSums[j] = avgResponses;
			avgResponses = avgResponses / numUsers;
			System.out.println("The average response is " + avgResponses + ".");
		}
		for (j = 0; j < 5; ++j) {
			if (j == 0) {
				ratingSums[j] = highestRating;
			}
			else {
				if (ratingSums[j] >= highestRating) {
					ratingSums[j] = highestRating;
					numHighRate = j;
				}
			}
			if (j == 0) {
				ratingSums[j] = lowestRating;
			}
			else {
				if (ratingSums[j] <= lowestRating) {
					ratingSums[j] = lowestRating;
					numLowRate = j;
				}
			}
		}
		System.out.println(numHighRate + " had the highest ratings, totalling at " + highestRating);
		System.out.println(numLowRate + " had the lowest ratings, totalling at " + lowestRating);
	}//Survey
		/* for (i = 0; i <= numUsers; ++i) {
			for (j = 0; j < 5; ++j) { //up-to-down loops would have been so much easier T-T
				System.out.println(topics[j] + responses[i][j]); 
			}*/
}//main




