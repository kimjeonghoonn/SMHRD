package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ð��� �Է� : ");
		int time = sc.nextInt();
		
		if(time>=18) {
			String result =  "����";
			System.out.println("����ð�" + result + "�Դϴ�.");
		}else {
			String result = "������";
			System.out.println("����ð�" + result + "�Դϴ�.");
		}
		
		
		
		

	}

}
