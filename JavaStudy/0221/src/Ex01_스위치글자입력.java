import java.util.Scanner;

public class Ex01_스위치글자입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//.next() : 스트링형태의 데이터를 입력하는 메소드.
		System.out.print("입력 : ");
		String data = sc.next();
		
		// String데이터는 참조형데이터타입 == 비교가 불가능.
		// 문자 형태를 비교할때는 .equals() 사용
//		if(data.equals("한국어")) {
//			System.out.println("안녕하세요!");
//		} else if(data.equals("영어")) {
//			System.out.println("헬로!");
//		}
		
		// 스위치문으로 작성
		switch (data) {
		case "한국어": 
			System.out.println("안녕하세요");
			break;
		case "영어":
			System.out.println("헬로");
			break;
		case "중국어":
			System.out.println("니하오");
			break;
		case "일본어":
			System.out.println("곤니찌와");
			break;
		
		default :
			System.out.println("모르는 언어에요");
		}

	}

}
