package chap06;

import java.util.Random;
import java.util.Scanner;

public class RandArrayNotOverlapped {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("10개 이하의 요소의 개수를 입력하세요: ");
		int eleNum;
		while (true) {
		eleNum = stdIn.nextInt();
		if (eleNum<=10) break;
		}
		// 요소 개수의 크기를 갖는 Array 생성
		int[] arr = new int[eleNum];
		Random rand = new Random();
		
		for (int i=0; i<eleNum; i++) {
			
			Inner:
			while(true) {
			arr[i] = rand.nextInt(10)+1;
			if(i!=0) {
			for(int j=0; j<i; j++) {
				if (arr[j]!=arr[i]) break Inner;
			}}
			else
				break Inner;
			}
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
	}

}
