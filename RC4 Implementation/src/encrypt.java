
public class encrypt implements RC4interface {
	int[] S = new int[256];

	public void SInitialize() {
		for (int i = 0; i < 256; i++) {
			S[i] = i;
		}
	}

	public void KSA() {
		String start = keyschedule.getResult();
		int j = 0;
		for (int i = 0; i < 256; i++) {
			j = ((j + S[i] + start.charAt(i % (start.length() / 8))) % 256);
			int temp = S[i];
			S[i] = j;
			S[j] = temp;
		}
	}

	public void PRGA() {
		int i = 0;
		int j = 0;
		while (S[i] != 0) {

		}
	}

	public void PrintResult() {

	}
}
