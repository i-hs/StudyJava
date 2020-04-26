package chap06;

import java.util.Scanner;

public class DiffLenMatrix {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int numOfRow;  // 행의 개
		int[][] matrix;
		System.out.println("서로 다른 열의 길이를 갖는 2차원 배열을 생성합니다.");
		System.out.print("행의 개수를 입력하세요: ");
		numOfRow = stdIn.nextInt();
		matrix = new int[numOfRow][];
		
		
		for(int i=0; i<numOfRow; i++) {  //for1
			System.out.printf("행 %d의 열의 개수를 입력하세요: ", i+1);
			int col = stdIn.nextInt();
			matrix[i] = new int[col];
		}  // for1
		
		for(int i=0; i<numOfRow; i++){  //for2
			for(int j=0; j<matrix[i].length; j++) { //for3
				System.out.printf("%d행 %d열의 요소의 정수 값을 입력하세요: " , i+1, j+1);
				matrix[i][j] = stdIn.nextInt();
			}  //for3
		}  //for2
		
		System.out.println("입력한 행렬의 요소를 출력합니다.");
		for(int i=0; i<numOfRow; i++){  //for4
			for(int j=0; j<matrix[i].length; j++) { //for5
				System.out.printf("%d  ", matrix[i][j]);
			}  //for5
			System.out.println();
		}  //for4
	}  // main

}  // class
