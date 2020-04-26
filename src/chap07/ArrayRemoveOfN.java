package chap07;

import java.util.Scanner;

public class ArrayRemoveOfN {

	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		// 배열 a의 a[idx]부터 n개의 요소를 삭제한 배열을 반환
		if(n<0 || idx<0 || idx>a.length) {
			return a.clone();
		} //if
		else {
			if (idx + n > a.length) 
				n = a.length - idx;
			int[] c = new int[a.length - n];
			int i=0;
			for(; i<idx; i++) 
				c[i] = a[i];
			
			for(; i<c.length; i++)
				c[i] = a[i+idx];
			return c;
		}  //else
	} //arrayRmvOfN
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("1차원 배열을 생성합니다. 배열의 길이를 입력하세요: ");
		int arraySize = stdIn.nextInt();
		int[] a = new int[arraySize];
		
		System.out.println("배열의 요소를 입력합니다.");
		for(int i=0; i<arraySize; i++) {
			System.out.print("배열["+i+"]의 요소: ");
			a[i] = stdIn.nextInt();
		} //for
		
		System.out.print("배열의 요소를 인덱스x 부터 y개를 삭제합니다. \nx: ");
		int x = stdIn.nextInt();
		System.out.print("y: ");
		int y = stdIn.nextInt();
		System.out.println("반환된 배열을 출력합니다.");
		int[] result = arrayRmvOfN(a, x, y);
		
		for(int i=0; i<result.length; i++) {
			System.out.printf("%d ", result[i]);
		}  //for
	}  //main

}
