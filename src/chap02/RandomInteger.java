package chap02;
import java.util.Random;
public class RandomInteger {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		// 난수 생성
		int n1 = 1 + rand.nextInt(9);  // 1 ~ 9
		int n2 = -1 - rand.nextInt(9);  // -1 ~ -9
		int n3 = 10 + rand.nextInt(90);  // 10 ~ 99
		System.out.println("3개의 난수를 생성 ");
		System.out.println("한 자리 양의 정수:"+ n1);
		System.out.println("한 자리 음의 정수:"+ n2);
		System.out.println("두 자리 양의 정수:"+ n3);
	}

}
