import java.util.Scanner;

public class Ex07_�迭����4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		//�Էº�
		for(int i =0;i<arr.length;i++) {
			System.out.print((i+1)+ "��° �Է�>>");
			arr[i]= sc.nextInt();
		}System.out.print("�Էµ� ����: ");
		//��º�
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		double avg = 0;
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) {
				max =arr[i];
			}if(min>arr[i]) {
				min = arr[i];
			}sum += arr[i];
			avg = (double)sum/arr.length;
		}System.out.println();
		System.out.println("�ְ� ����: " +max);
		System.out.println("���� ����: "+min);
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
		
		
		
		
//		System.out.println("\ntest"+arr);
		//String ���ڿ� --> char�� ������� �迭!
		
		
		
		
	}

}
