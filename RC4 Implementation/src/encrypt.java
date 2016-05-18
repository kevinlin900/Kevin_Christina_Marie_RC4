import java.util.Arrays;
import java.util.Scanner;

public class encrypt { // implements RC4interface {
	private static int[] S = new int[256];
	private static int[] K = new int[256];
	private static String binary = "";
	private static String key, plaintext = "";
	private static int ASCIIvalue = 0;

	
	public static void main(String[] args) {
		System.out.println("Enter key: ");
		Scanner in = new Scanner(System.in);
		key = in.nextLine(); // KEY VARIABLE INITIALIZED
		System.out.println("Enter plaintext: ");
		plaintext = in.nextLine();
		char[] split = new char[key.length()];
		split = key.toCharArray();

		receive two = new receive();
		//two.toBinary(split); // result is now in binary code!!!
		//System.out.println(binary);

		// two.SInitialize();
		two.KSA();
		two.PRGA();
		// two.PRGA();

	}

	// public void SInitialize() {
	// for (int i = 0; i < 256; i++) {
	// S[i] = i;
	// }
	// }

	public void KSA() {
		for (int i = 0; i < 256; i++) {
			S[i] = i;
			K[i] = (int) (key.charAt(i % key.length()));
		}
		int j = 0;
		for (int i = 0; i < 256; i++) {
			j = (j + S[i] + K[i]) % 256;
			int temp = S[i];
			S[i] = S[j];
			S[j] = temp;
		}
		System.out.print(Arrays.toString(S));
		System.out.print("\n");
	}


	public void PRGA() {
		int i=0;
		int j=0;
		int count = 0;
		String hexString = "";

		while (count<plaintext.length()){
			i = (i+1)%256;
			j = (j + S[i])%256;
			int temp = S[i];
			S[i] = S[j];
			S[j] = temp;
			
			//test
			for(int a = 0;a<256; a++)
			{
				System.out.print(S[a] + " ");
			}
			
			int k = S[(S[i] + S[j])%256];

					//(char) (plaintext.charAt(i)^k);
			count++;

			int unicode = (int)plaintext.charAt(i-1);
			//bitwise AND w/ nextint & unicode1
		
			int bitwise = unicode^k;
	
			//test
			System.out.println("\n" + "nextint " + k);
			System.out.println("unicode " + unicode);
			System.out.println("bitwise " + bitwise);
			
			
			String hex = Integer.toHexString(bitwise);
			
			hexString += hex;

		}

		System.out.print("ENCRYPTED: " + hexString);

	}

	public void PrintResult() {


	}
}
