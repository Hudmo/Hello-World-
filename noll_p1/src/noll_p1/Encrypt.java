package noll_p1;
import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_ELEMENTS = 5;
		int[] userNumArray = new int[NUM_ELEMENTS];
		// static int [] numDecryptArray = new int[NUM_ELEMENTS];
		//int i;
		System.out.print("Input 4-digit code, with spaces between each integer: ");
		/*for (i = 0; i < NUM_ELEMENTS; ++i) {
			userNumArray[i] = scnr.nextInt();		// { for loop requires 2 inputs of the digits
			System.out.print(userNumArray[i]);
		}*/
		userNumArray[0] = scnr.nextInt();
		userNumArray[1] = scnr.nextInt();			// } individual scnr requires only 1 input
		userNumArray[2] = scnr.nextInt();
		userNumArray[3] = scnr.nextInt();
		//System.out.print("\n\n");
		/*int numDecrypt1 = ((userNumArray[1] + 7) / 10);
		int numDecrypt2 = ((userNumArray[2] + 7) / 10);
		int numDecrypt3 = ((userNumArray[3] + 7) / 10);
		int numDecrypt4 = ((userNumArray[4] + 7) / 10);*/
		int userNum1 = ((userNumArray[0] + 7) % 10);
		int userNum2 = ((userNumArray[1] + 7) % 10);
		int userNum3 = ((userNumArray[2] + 7) % 10);
		int userNum4 = ((userNumArray[3] + 7) % 10);

		int numEncrypt1 = userNum3;
		int numEncrypt2 = userNum4;
		int numEncrypt3 = userNum1;
		int numEncrypt4 = userNum2;

		System.out.print("Encrypted 4-digit code: ");
		System.out.print(numEncrypt1);
		System.out.print(numEncrypt2);
		System.out.print(numEncrypt3);
		System.out.println(numEncrypt4);
		 /* int[] userTemp = new int[NUM_ELEMENTS]; int startPos = 1; for (i = 0; i <
		 userNumArray.length; ++i) { userDecryptArray[i] = ((userNumArray[i] + 7)
		 /10); public static void arraycopy(Object userNumArray, int startPos, Object
		 userDecryptArray, startPos, NUM_ELEMENTS); userDecryptArray[i] =
		 ((userNumArray[i] + 7) / 10);*/ //Error
	}
}
