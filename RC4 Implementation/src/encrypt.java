import java.util.Arrays;
import java.util.Scanner;

public class encrypt { // implements RC4interface {
	private static int[] S = new int[256];
	private static String binary = "";
	private static String key = "";
	private static int ASCIIvalue = 0;

	public static void main(String[] args) {
		System.out.println("Enter key: ");
		Scanner in = new Scanner(System.in);
		key = in.nextLine(); // KEY VARIABLE INITIALIZED
		char[] split = new char[key.length()];
		split = key.toCharArray();

		encrypt two = new encrypt();
		two.toBinary(split); // result is now in binary code!!!
		System.out.println(binary);

		two.SInitialize();
		two.KSA();
		// two.PRGA();

	}

	public void SInitialize() {
		for (int i = 0; i < 256; i++) {
			S[i] = i;
		}
	}

	public void KSA() {
		int j = 0;
		for (int i = 0; i < 256; i++) {
			j = (j + S[i] + binary.charAt(i % key.length())) % 256;
			int temp = S[i];
			S[i] = j;
			S[j] = temp;
		}
		System.out.print(Arrays.toString(S));
	}

	public void PRGA() {
		int i = 0;
		int j = 0;
		while (S[i] != 0) {

		}
	}

	public void toBinary(char[] something) {
		for (char part : something) {
			if (part == 'A') {
				binary += "01000001";
			}
			if (part == 'B') {
				binary += "01000010";
			}
			if (part == 'C') {
				binary += "01000011";
			}
			if (part == 'D') {
				binary += "01000100";
			}
			if (part == 'E') {
				binary += "01000101";
			}
			if (part == 'F') {
				binary += "01000110";
			}
			if (part == 'G') {
				binary += "01000111";
			}
			if (part == 'H') {
				binary += "01001000";
			}
			if (part == 'I') {
				binary += "01001001";
			}
			if (part == 'J') {
				binary += "01001010";
			}
			if (part == 'K') {
				binary += "01001011";
			}
			if (part == 'L') {
				binary += "01001100";
			}
			if (part == 'M') {
				binary += "01001101";
			}
			if (part == 'N') {
				binary += "01001110";
			}
			if (part == 'O') {
				binary += "01001111";
			}
			if (part == 'P') {
				binary += "01010000";
			}
			if (part == 'Q') {
				binary += "01010001";
			}
			if (part == 'R') {
				binary += "01010010";
			}
			if (part == 'S') {
				binary += "01010011";
			}
			if (part == 'T') {
				binary += "01010100";
			}
			if (part == 'U') {
				binary += "01010101";
			}
			if (part == 'V') {
				binary += "01010110";
			}
			if (part == 'W') {
				binary += "01010111";
			}
			if (part == 'X') {
				binary += "01011000";
			}
			if (part == 'Y') {
				binary += "01011001";
			}
			if (part == 'Z') {
				binary += "01011010";
			}

			if (part == 'a') {
				binary += "01100001";
			}
			if (part == 'b') {
				binary += "01100010";
			}
			if (part == 'c') {
				binary += "01100011";
			}
			if (part == 'd') {
				binary += "01100100";
			}
			if (part == 'e') {
				binary += "01100101";
			}
			if (part == 'f') {
				binary += "01100110";
			}
			if (part == 'g') {
				binary += "01100111";
			}
			if (part == 'h') {
				binary += "01101000";
			}
			if (part == 'i') {
				binary += "01101001";
			}
			if (part == 'j') {
				binary += "01101010";
			}
			if (part == 'k') {
				binary += "01101011";
			}
			if (part == 'l') {
				binary += "01101100";
			}
			if (part == 'm') {
				binary += "01101101";
			}
			if (part == 'n') {
				binary += "01101110";
			}
			if (part == 'o') {
				binary += "01101111";
			}
			if (part == 'p') {
				binary += "01110000";
			}
			if (part == 'q') {
				binary += "01110001";
			}
			if (part == 'r') {
				binary += "01110010";
			}
			if (part == 's') {
				binary += "01110011";
			}
			if (part == 't') {
				binary += "01110100";
			}
			if (part == 'u') {
				binary += "01110101";
			}
			if (part == 'v') {
				binary += "01110110";
			}
			if (part == 'w') {
				binary += "01110111";
			}
			if (part == 'x') {
				binary += "01111000";
			}
			if (part == 'y') {
				binary += "01111001";
			}
			if (part == 'z') {
				binary += "01111010";
			}

			if (part == '0') {
				binary += "00110000";
			}
			if (part == '1') {
				binary += "00110001";
			}
			if (part == '2') {
				binary += "00110010";
			}
			if (part == '3') {
				binary += "00110011";
			}
			if (part == '4') {
				binary += "00110100";
			}
			if (part == '5') {
				binary += "00110101";
			}
			if (part == '6') {
				binary += "00110110";
			}
			if (part == '7') {
				binary += "00110111";
			}
			if (part == '8') {
				binary += "00111000";
			}
			if (part == '9') {
				binary += "00111001";
			}

			if (part == ' ') {
				binary += "00100000";
			}
			if (part == '!') {
				binary += "00100001";
			}
			if (part == '"') {
				binary += "00100010";
			}
			if (part == '#') {
				binary += "00100011";
			}
			if (part == '$') {
				binary += "00100100";
			}
			if (part == '%') {
				binary += "00100101";
			}
			if (part == '&') {
				binary += "00100110";
			}
			if (part == '(') {
				binary += "00101000";
			}
			if (part == ')') {
				binary += "00101001";
			}
			if (part == '*') {
				binary += "00101010";
			}
			if (part == '+') {
				binary += "00101011";
			}
			if (part == ',') {
				binary += "00101100";
			}
			if (part == '-') {
				binary += "00101101";
			}
			if (part == '.') {
				binary += "00101110";
			}
			if (part == '/') {
				binary += "00101111";
			}
			if (part == ':') {
				binary += "00111010";
			}
			if (part == ';') {
				binary += "00111011";
			}
			if (part == '<') {
				binary += "00111100";
			}
			if (part == '=') {
				binary += "00111101";
			}
			if (part == '>') {
				binary += "00111110";
			}
			if (part == '?') {
				binary += "00111111";
			}
			if (part == '@') {
				binary += "01000000";
			}
			if (part == '[') {
				binary += "01011011";
			}
			if (part == ']') {
				binary += "01011101";
			}
			if (part == '^') {
				binary += "01011110";
			}
			if (part == '_') {
				binary += "01011111";
			}
			if (part == '`') {
				binary += "01100000";
			}
			if (part == '{') {
				binary += "01111011";
			}
			if (part == '|') {
				binary += "01111100";
			}
			if (part == '}') {
				binary += "01111101";
			}
			if (part == '~') {
				binary += "01111110";
			}
		}
	}

}
