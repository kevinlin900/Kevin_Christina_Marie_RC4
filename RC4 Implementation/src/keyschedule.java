import java.util.Scanner;

public class keyschedule {

	private static String result = "";

	public static void main(String[] args) {
		System.out.println("Enter key: ");
		Scanner in = new Scanner(System.in);
		String password = in.nextLine();

		char[] split = new char[password.length()];
		split = password.toCharArray();
		toBinary(split);
		System.out.println(result);

	}

	public static void toBinary(char[] something) {
		for (char part : something) {
			if (part == 'A') {
				result += "01000001";
			}
			if (part == 'B') {
				result += "01000010";
			}
			if (part == 'C') {
				result += "01000011";
			}
			if (part == 'D') {
				result += "01000100";
			}
			if (part == 'E') {
				result += "01000101";
			}
			if (part == 'F') {
				result += "01000110";
			}
			if (part == 'G') {
				result += "01000111";
			}
			if (part == 'H') {
				result += "01001000";
			}
			if (part == 'I') {
				result += "01001001";
			}
			if (part == 'J') {
				result += "01001010";
			}
			if (part == 'K') {
				result += "01001011";
			}
			if (part == 'L') {
				result += "01001100";
			}
			if (part == 'M') {
				result += "01001101";
			}
			if (part == 'N') {
				result += "01001110";
			}
			if (part == 'O') {
				result += "01001111";
			}
			if (part == 'P') {
				result += "01010000";
			}
			if (part == 'Q') {
				result += "01010001";
			}
			if (part == 'R') {
				result += "01010010";
			}
			if (part == 'S') {
				result += "01010011";
			}
			if (part == 'T') {
				result += "01010100";
			}
			if (part == 'U') {
				result += "01010101";
			}
			if (part == 'V') {
				result += "01010110";
			}
			if (part == 'W') {
				result += "01010111";
			}
			if (part == 'X') {
				result += "01011000";
			}
			if (part == 'Y') {
				result += "01011001";
			}
			if (part == 'Z') {
				result += "01011010";
			}

			if (part == 'a') {
				result += "01100001";
			}
			if (part == 'b') {
				result += "01100010";
			}
			if (part == 'c') {
				result += "01100011";
			}
			if (part == 'd') {
				result += "01100100";
			}
			if (part == 'e') {
				result += "01100101";
			}
			if (part == 'f') {
				result += "01100110";
			}
			if (part == 'g') {
				result += "01100111";
			}
			if (part == 'h') {
				result += "01101000";
			}
			if (part == 'i') {
				result += "01101001";
			}
			if (part == 'j') {
				result += "01101010";
			}
			if (part == 'k') {
				result += "01101011";
			}
			if (part == 'l') {
				result += "01101100";
			}
			if (part == 'm') {
				result += "01101101";
			}
			if (part == 'n') {
				result += "01101110";
			}
			if (part == 'o') {
				result += "01101111";
			}
			if (part == 'p') {
				result += "01110000";
			}
			if (part == 'q') {
				result += "01110001";
			}
			if (part == 'r') {
				result += "01110010";
			}
			if (part == 's') {
				result += "01110011";
			}
			if (part == 't') {
				result += "01110100";
			}
			if (part == 'u') {
				result += "01110101";
			}
			if (part == 'v') {
				result += "01110110";
			}
			if (part == 'w') {
				result += "01110111";
			}
			if (part == 'x') {
				result += "01111000";
			}
			if (part == 'y') {
				result += "01111001";
			}
			if (part == 'z') {
				result += "01111010";
			}

			if (part == '0') {
				result += "00110000";
			}
			if (part == '1') {
				result += "00110001";
			}
			if (part == '2') {
				result += "00110010";
			}
			if (part == '3') {
				result += "00110011";
			}
			if (part == '4') {
				result += "00110100";
			}
			if (part == '5') {
				result += "00110101";
			}
			if (part == '6') {
				result += "00110110";
			}
			if (part == '7') {
				result += "00110111";
			}
			if (part == '8') {
				result += "00111000";
			}
			if (part == '9') {
				result += "00111001";
			}
		}
	}

	// public String toString(){
	// return result;
	// }
}
