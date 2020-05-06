package chap15;

public class AsciiCode {
	public static void main(String[] args) {
		for(char i=0x21; i<=0x7E; i++) {
			System.out.printf("%c %04x\t", i, (int)i);
			if (i%8==0) System.out.println();
		}
	}

}
