package noll_p1;
import java.util.Scanner;

public class Main {
	Scanner scnr = new Scanner(System.in);
	public void Encrypt();
	//User Q: Continue?
		boolean willContinue = false;
		String userContinue; 
		
		System.out.print("Request code decryption? (yes,no)");
		userContinue = scnr.next();
		
		if (userContinue == "yes" || userContinue == "Yes") {
			continue;
		}
		else {
			break;
		}return 0;
		
	public void Decrypt();
	}
//Encryption application	
public void Encrypt() {
	
	//Scanner scnr = new Scanner(System.in);
	final static int NUM_ELEMENTS = 5;
	static int [] userNumArray = new int[NUM_ELEMENTS];
	//static int [] numDecryptArray = new int[NUM_ELEMENTS];
	static int i;
	
	System.out.print("Input 4-digit code: ");
	
	for (i = 0; i < userNumArray.length(); ++i) {
		userNumArray[i] = scnr.nextInt();
		System.out.print(userNumArray[i]);
	}
	System.out.print("\n\n");
	
	static int numDecrypt1 = ((userNumArray[1] + 7) / 10);
	static int numDecrypt2 = ((userNumArray[2] + 7) / 10);
	static int numDecrypt3 = ((userNumArray[3] + 7) / 10);
	static int numDecrypt4 = ((userNumArray[4] + 7) / 10);
	
	int userNum1 = ((userNumArray[1] + 7) % 10);
	int userNum2 = ((userNumArray[2] + 7) % 10);
	int userNum3 = ((userNumArray[3] + 7) % 10);
	int userNum4 = ((userNumArray[4] + 7) % 10);
	
	int numEncrypt1 = userNum3;
	int numEncrypt2 = userNum4;
	int numEncrypt3 = userNum1;
	int numEncrypt4 = userNum2;
	
	System.out.print("Encrypted 4-digit code: ");
	System.out.print(numEncrypt1);
	System.out.print(numEncrypt2);
	System.out.print(numEncrypt3);
	System.out.println(numEncrypt4);
	/* int[] userTemp = new int[NUM_ELEMENTS];
	int startPos = 1;
	for (i = 0; i < userNumArray.length; ++i) {
		userDecryptArray[i] = ((userNumArray[i] + 7) /10);
		public static void arraycopy(Object userNumArray, int startPos, 
				Object userDecryptArray, startPos, NUM_ELEMENTS); 
		userDecryptArray[i] = ((userNumArray[i] + 7) / 10); Error */
	}

	//Decryption application 
	public void Decrypt() {

		//Scanner scnr = new Scanner(System.in);
		static int [] numDecryptArray = new int[NUM_ELEMENTS];
		
		System.out.print("Decrypting " + numEncrypt1 + numEncrypt2 + numEncrypt3 + 
				numEncrypt4 + "\n\n");
		
		userNum5 = (numDecrypt1 * 10) - 7;
		userNum6 = (numDecrypt2 * 10) - 7;
		userNum7 = (numDecrypt3 * 10) - 7;
		userNum8 = (numdecrypt4 * 10) - 7;
		
		System.out.print("Decrypted 4-digit code: ");
		System.out.print(userNum5);
		System.out.print(userNum6);
		System.out.print(userNum7);
		System.out.println(userNum8);
		/* System.out.print("Input 4-digit encryption: ");
		
		for (i = 0; i < userNumArray.length; ++i) {
			numDecryptArray[i] = scnr.nextInt();
			System.out.print(numDecryptArray[i]);
		}
		System.out.print("\n\n"); */
		/* int userNum5 = ((numDecryptArray[3] * 10) - 7); 	//these are * 10, should be R 10
		int userNum6 = ((numDecryptArray[4] * 10) - 7); 	//(reverse %)
		int userNum7 = ((numDecryptArray[1] * 10) - 7);
		int userNum8 = ((numDecryptArray[2] * 10) - 7); */
	}
}


