
public class Ex03_배열기초 {

	public static void main(String[] args) {
		//배열은 같은 타입의 데이터를 하나로 묶어서 관리하는 데이터 타입
		// 데이터타입[] 배열명 = new 데이터타입[데이터크기]
		// ex) int형 5칸짜리 배열 생성
		// --> int[] arr = new int[5];
		
		// ex) int형 배열에 1,2,3 데이터를 넣어서 생성
		// --> int[] arr2 = {1,2,3};

		// ex) arr배열의 인덱스 0번자리에 숫자 5를 넣고싶다면
		// --> arr[0] = 5;
		
		// ex) arr2배열에서 숫자 3을 꺼내고 싶을때!
		// --> arr2[2]
		
		int[] arr = new int[5];
		// 1,3,6,7,10 넣기
		arr[0] =1;
		arr[1] =3;
		arr[2] =6;
		arr[3] =7;
		arr[4] =10;
		
		//출력문 통해서 숫자 7을 꺼내오기
		System.out.println(arr[3]);
		
		//인트형 배열을 선언할건데, 숫자 1,2,3 담아서 바로 제작
		int[] arr2 = {1,2,3};
	}

}
