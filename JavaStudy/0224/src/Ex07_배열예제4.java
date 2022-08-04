import java.util.Scanner;

public class Ex07_배열예제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		//입력부
		for(int i =0;i<arr.length;i++) {
			System.out.print((i+1)+ "번째 입력>>");
			arr[i]= sc.nextInt();
		}System.out.print("입력된 점수: ");
		//출력부
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
		System.out.println("최고 점수: " +max);
		System.out.println("최저 점수: "+min);
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);
		
		
		
		
//		System.out.println("\ntest"+arr);
		//String 문자열 --> char로 만들어진 배열!
		
		
		
		
	}

}
