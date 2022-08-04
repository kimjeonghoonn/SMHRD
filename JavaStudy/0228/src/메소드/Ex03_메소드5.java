package 메소드;

public class Ex03_메소드5 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		powerN(base, n);
		}

	//리턴을 시켜주지 않을때는 반환타입 위치에 void라는 키워드를 사용한다!
	public static void powerN(int base, int n) {
		// 누적 곱 구하기
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * base;
			//result *= base;
			//(막힌점) 제곱 연산을 할줄 몰랐음
		}
		System.out.println("결과 확인 : " + result);
		
	}
}
