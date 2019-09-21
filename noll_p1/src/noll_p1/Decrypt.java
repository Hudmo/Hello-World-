package noll_p1;
import java.util.Scanner;

public class Decrypt {
	
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_ELEMENTS = 5;
		int[] numDecryptArray = new int[NUM_ELEMENTS];
		int numDecrypt1 = 0;
		int numDecrypt2 = 0;
		int numDecrypt3 = 0;
		int numDecrypt4 = 0;
		/*int numEncrypt1;
		int numEncrypt2;
		int numEncrypt3;
		int numEncrypt4;*/
		int numUser1 = 0;
		int numUser2 = 0;
		int numUser3 = 0;
		int numUser4 = 0;

		System.out.println("Input encrypted 4-digit code for decryption: ");
		numDecryptArray[0] = scnr.nextInt();
		numDecryptArray[1] = scnr.nextInt();
		numDecryptArray[2] = scnr.nextInt();
		numDecryptArray[3] = scnr.nextInt();
		
		System.out.print("Decrypting " + numDecryptArray[0] + numDecryptArray[1] 
				+ numDecryptArray[2] + numDecryptArray[3] + "\n\n");
		
		numDecrypt1 = numDecryptArray[2];
		numDecrypt2 = numDecryptArray[3];
		numDecrypt3 = numDecryptArray[0];
		numDecrypt4 = numDecryptArray[1];
		//System.out.println(numDecryptArray[2]);
		//System.out.println(numDecrypt1);
		numUser1 = ((numDecrypt1 * 10) - 7) / 10;
		numUser2 = ((numDecrypt2 * 10) - 7) / 10;	//infinite possibilities for source numbers
		numUser3 = ((numDecrypt3 * 10) - 7) / 10;	//of remainders... impossible to reverse
		numUser4 = ((numDecrypt4 * 10) - 7) / 10;	//without all inputs in one program ::
		//System.out.println(numDecrypt1);
		//System.out.println(numUser1);
		System.out.print("Decrypted 4-digit code: ");
		System.out.print(numUser1);
		System.out.print(numUser2);
		System.out.print(numUser3);
		System.out.println(numUser4);
		/*System.out.print("Input 4-digit encryption: ");
		for (i = 0; i < userNumArray.length; ++i) { 
		numDecryptArray[i] = scnr.nextInt(); 
		System.out.print(numDecryptArray[i]); 
		}
		System.out.print("\n\n");
		int userNum5 = ((numDecryptArray[3] * 10) - 7); //these are * 10, should be R 10 
		int userNum6 = ((numDecryptArray[4] * 10) - 7); //(reverse %) 
		int userNum7 = ((numDecryptArray[1] * 10) - 7); 
		int userNum8 = ((numDecryptArray[2] * 10)- 7);*/
		
		/*// User Q: Continue?
		boolean willContinue = false;
		String userContinue;
		System.out.print("Request code decryption? (yes,no)");
		userContinue=scnr.next();
		if(userContinue=="yes"|| userContinue=="Yes") {
			continue;
		}
		else {
			break;
		}*/

	}
}