
public class Ex01_for������1 {

	public static void main(String[] args) {
		
		//������ ���� ���ϴ� ���� +=
		//(77*1) + (76*2) ++++ (1*77);
		// ������� 79079
		
		int total = 0;
		
		for(int i =1; i<=77; i++) {
			total += (78-i)*i;
			
		}
		System.out.println(total);

	}

}
