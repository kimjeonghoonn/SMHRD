
public class Ex04_이차원배열4 {

	public static void main(String[] args) {
		int array[][] = new int[5][5];
		int num = 21;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		//[0][4] [0][3] [0][2] [0][1] ....
//		for(int i = 0; i<array.length;i++) {
//			for(int j =0; j<array[0].length; j++) {
//				System.out.print(array[i][array[0].length-j-1]+"\t");
//			}System.out.println();
//		}
		//[4][0] [3][0] 
		for(int i = 0; i<array.length;i++) {
			for(int j =0; j<array[0].length; j++) {
				System.out.print(array[array[0].length-j-1][i]+"\t");
			}System.out.println();
		}
	}

}
