package chap06;

public class IntArray {

	public static void main(String[] args) {
		int[] arr = new int[5];  // 요소가 5개인 int형 배열 arr 선언
		int[] arr2 = new int[5];  // 요소가 5개인 int형 배열 arr2 선언
		
		
		for(int i = 0; i<5; i++) {
			System.out.println("arr["+i+"]의 초기값 = "+arr[i]);
		}
		
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = 5-i;
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
			
		
	}

}
