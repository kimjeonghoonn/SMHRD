
public class Ex07_for문예제6 {

	public static void main(String[] args) {
	
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			
			if(i%2==0) { 
				System.out.print(-i + " ");
				sum -=i;
			} else {
				System.out.print(i + " ");
				sum += i; 
			}
		}
//		System.out.println(); //줄을 바꿀거에요!
		System.out.println("\n결과 : " + sum);

	}

}
