
public class Ex02_�������迭2 {

	public static void main(String[] args) {
		
		// 5�� 5�� ũ���� 2���� �迭 array�� ����!
		int array[][] = new int[5][5];
		
		//21~45���� �迭
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
