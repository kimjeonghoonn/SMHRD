import java.util.Scanner;

public class Ex09_배열예제6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ans = {1,4,3,2,1};
		int[] user = new int[5];
		//1. user라는 배열에 사용자가 입력한 값을 넣어주세요!
		
		for(int i =0;i<user.length;i++) {
			System.out.print((i+1)+"번째 데이터>>");
			user[i] = sc.nextInt();
	
		}
		
		//2. ans 라는 배열과 user라는 배열을 비교해서
		// 값이 같다면 'O', 다르다면 'X' 출력시켜주세요!
		int cor = 0;
		for(int i=0;i<user.length;i++) {
			if(user[i]== ans[i]) {
				
				System.out.print("O ");
//				cor +=20;
				cor +=1;
			}else {
				System.out.print("X ");
			}
		}System.out.println("총 점 : " + cor*20);
		
	}

}
