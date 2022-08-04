package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재시간을 입력 : ");
		int time = sc.nextInt();
		
		if(time>=18) {
			String result =  "저녁";
			System.out.println("현재시간" + result + "입니다.");
		}else {
			String result = "나머지";
			System.out.println("현재시간" + result + "입니다.");
		}
		
		
		
		

	}

}
