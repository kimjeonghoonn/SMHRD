
public class Ex08_�迭����5 {

	public static void main(String[] args) {
		
		int[] starCount = {3,4,4,2,1};

		for(int i =0; i<starCount.length;i++) {
			System.out.print(starCount[i] + " : ");
			for(int j =0;j<starCount[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
	}

}
