
public class Ex08_for문예제7 {

	public static void main(String[] args) {

//		for (int i = 1; i < 10; i++) {
//			System.out.println(2 + " * " + i + "=" + 2 * i);
//		}
//		//3단과 4단도 출력시켜주세요.
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(3 + " * " + i + "=" + 3 * i);
//		}
//		for (int i = 1; i < 10; i++) {
//			System.out.println(4 + " * " + i + "=" + 4 * i);
//		}
		
		//이중 반복문 or 이중 for문!!!
		for(int j=2;j<5;j++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + "=" + j * i);
			}
		}
	}

}
