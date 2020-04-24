package chap06;

import java.util.Random;
import java.util.Scanner;

public class ColumnChart {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int eleNum;  // 요소 개수 변수 선
		int[] arr;  // 배열 변수 선언
		
		while(true) {
		System.out.print("9개 이하의 요소 개수를 입력하세요: ");
		eleNum = stdIn.nextInt();  // 요소 수 입
		if (eleNum<=9) {
			arr = new int[eleNum];  // 배열 객체 생
			break;}
		else
			continue;
		}
		
		Random rand = new Random();  
		for(int i=0; i<eleNum; i++) {
			arr[i] = rand.nextInt(10)+1;  // 1~10 난수 
		}
		
		// *를 이용한 그래프 출력
		for (int i=10; i>=0; i--) {
			for(int j=0; j<eleNum; j++) {
				if (arr[j]>=(i+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		// 구분선(-) 출력
		for(int i=0; i<eleNum; i++)
			System.out.print("--");
		System.out.println();
		// 요소 난 출력
		for(int i=0; i<eleNum; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		// 요소 Number 출력
		for(int i=0; i<eleNum; i++)
			System.out.print((i+1)+" ");
		
	}

}
