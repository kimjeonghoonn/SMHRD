
public class Ex03_이차원배열3 {

	public static void main(String[] args) {
int array[][] = new int[5][5];
		
		//입력부
		int num = 21;
		
		for(int i = 0; i<array.length;i++) {
			for(int j =0; j<array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		//출력부 [0][0] [1][0] [2][0] ...을 출력해야됨
		for(int i = 0; i<array.length;i++) {
			for(int j =0; j<array[0].length; j++) {
				System.out.print(array[j][i]+"\t");
			}System.out.println();
		}

	}

}
