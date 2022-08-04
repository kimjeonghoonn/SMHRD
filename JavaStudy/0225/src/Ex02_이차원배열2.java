
public class Ex02_이차원배열2 {

	public static void main(String[] args) {
		
		// 5행 5열 크기의 2차원 배열 array를 선언!
		int array[][] = new int[5][5];
		
		//21~45까지 배열
		int num = 21;
		for(int i = 0; i<array.length;i++) {
			for(int j =0; j<array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+"\t");
			}System.out.println();
		}

	}

}
