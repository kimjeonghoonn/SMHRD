import java.util.Scanner;

public class Ex09_if_else���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		int result = num/10*10;
		if(num%10>=5) {System.out.println("�ݿø� �� :" + (result+10));
			
		}else {System.out.println("�ݿø� �� :" + result);
		
		}

	}

}
