package jh;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 제시된 자판기 코드를 자판기 객체를 활용하는
		// 코드로 변경해보자!!
		// main메소드에서는 각 기능을 1번씩 호출하도록 해보자
		VendingMachine vend = new VendingMachine();
		Scanner sc = new Scanner(System.in);
		
		vend.showTitle();
		
		
		vend.process();
	      

	}

}
