
public class Ex01_�������迭1 {

	public static void main(String[] args) {
		
		//5��5��¥�� array��¤� �̸��� 2���� �迭�� ����� �;��!
		int[][] array = new int[5][5];
		//�����͸� 1���� 25���� �־��ּ���
		int num=1;
		//num�� �̿��ؼ� 1�࿡�� 1~5���� ���� �־��ּ���!
		for(int i=0; i<array.length;i++) {
			for(int j =0; j<array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+"\t"); // \t -> tab��ŭ �����!
			}
			System.out.println();
		}
	
		
	}

}
