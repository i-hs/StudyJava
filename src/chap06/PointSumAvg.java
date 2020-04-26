package chap06;

import java.util.Scanner;

public class PointSumAvg {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int numOfStd = 6;
		int [][] point = new int[numOfStd][2];
		int[] sumStd = new int[numOfStd];
		int[] sumSub = new int[2];
		
		System.out.printf("%d 명의 국어, 수학 점수를 입력하세요.\n", numOfStd);
		
		for(int i=0; i<numOfStd; i++) { // for1
			System.out.printf("국어%d: ", i+1);
			point[i][0] = stdIn.nextInt();
			System.out.printf("수학%d: ", i+1);
			point[i][1] = stdIn.nextInt();
			sumStd[i] = point[i][0] + point[i][1];  // 학생 개인의 점수합 
			sumSub[0] = point[i][0];  // 국어 과목 
			sumSub[1] = point[i][1];  // 수학 과목 
		} // for1
		
		System.out.println("No.   국어   수학   평균 ");
		for (int i=0; i<numOfStd; i++) {  //for2
			System.out.printf(" %d    %d     %d     %f \n", i+1, point[i][0], point[i][1], sumStd[i]/2.0);
		}  //for2
		System.out.printf("평균  %f    %f", (float)sumSub[0]/numOfStd, (float)sumSub[1]/numOfStd);
		
	} // main 
	} // class
