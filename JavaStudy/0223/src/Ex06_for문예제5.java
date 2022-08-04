
public class Ex06_for문예제5 {

	public static void main(String[] args) {
		
		int sum = 0;
//		
//		for(int i = 1; i<=100; i++) {
//			if(i%3==0) {
//				sum += i;
//				}
//		}System.out.println("3의 배수 합 : " + sum);

		int i=1;
		while(i<=100) {
			if(i%3==0) {
				sum += i;
			}
			i++;
		}System.out.println("3의 배수 합 : " + sum);
	}

}
