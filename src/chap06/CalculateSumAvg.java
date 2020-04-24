package chap06;

import java.util.Scanner;

public class CalculateSumAvg {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수를 입력하세요: ");
		int eleNum = stdIn.nextInt();
		double[] arr = new double[eleNum];
		double sum = 0;
		
		for(int i=0; i<eleNum; i++) {
			System.out.print("요소 arr["+i+"] 입력: ");
			arr[i] = stdIn.nextInt();
		}
		
		for(double element : arr) { // 변수 element에 배열 arr요소가 대입됨.
			sum += element;
		}
		
		System.out.println("요소의 총합(sum):"+ sum);
		System.out.println("요소의 평균(avg):"+ (sum/arr.length));   // 평균=sum/ arr배열 요소의 수 
	}
}
