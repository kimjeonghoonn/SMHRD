
public class Ex07_for������6 {

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
//		System.out.println(); //���� �ٲܰſ���!
		System.out.println("\n��� : " + sum);

	}

}
