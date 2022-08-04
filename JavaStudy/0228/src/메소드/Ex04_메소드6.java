package 메소드;

import java.util.Arrays;

public class Ex04_메소드6 {

	public static void main(String[] args) {
		int[] array = {1,3,4,8,7,9,10};
		int num1 = 10; // num1을 받는 메소드
		arrayToString(array, num1); //배열안에 있는 데이터를 출력시키는 메소드!!
		
		System.out.println("결과1 : " + array[0]);
		System.out.println("결과2 : " + num1);
	}
	public static void arrayToString(int[] array, int num1) {
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+ " ");
//		}
		array[0]=30;
		num1 = 30;
		
		System.out.println(Arrays.toString(array));
		
	}

}
