package jh;
import java.util.Scanner;

public class VendingMachine {
	Scanner sc = new Scanner(System.in);
	
	
	int choice;
	int money;
	int itemMoney;
	
	public void showTitle() {
		System.out.println("===���Ǳ� ���α׷�===");
	}
	
	public void process() {
		
		Scanner sc = new Scanner(System.in);
	      System.out.print("���� �������� >> ");
	      int money = sc.nextInt();

		System.out.println("�޴��� �����ϼ���");
	      System.out.print("1.��(700) 2.�ݶ�(1000) 3.Ŀ��(500) >>");
	      int choice = sc.nextInt();
	      
	      int itemMoney = 0;
	      if(choice == 1){
	         itemMoney = 700;
	      }else if(choice == 2){
	         itemMoney = 1000;
	      }else if(choice == 3){
	         itemMoney = 500;
	      }
	      
	      if(money - itemMoney < 0){
	         System.out.println("���� �����մϴ�.");
	      }else{
	         money -= itemMoney;
	         System.out.println(money+"���� ���ҽ��ϴ�.");
	      }
	}
}
