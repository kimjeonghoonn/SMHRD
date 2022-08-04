
public class Ex01_for문예제1 {

	public static void main(String[] args) {
		
		//누적된 합을 구하는 문제 +=
		//(77*1) + (76*2) ++++ (1*77);
		// 결과값이 79079
		
		int total = 0;
		
		for(int i =1; i<=77; i++) {
			total += (78-i)*i;
			
		}
		System.out.println(total);

	}

}
