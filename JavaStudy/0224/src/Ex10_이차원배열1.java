
public class Ex10_이차원배열1 {

	public static void main(String[] args) {
		
		//array라는 이름의 5행 5열짜리 2차원 배열을 만들꺼에요!
		int[][] array = new int[5][5];
		
		//array라는 배열을 1~25까지의 숫자로 초기화 시킬꺼에요!
		int num=1;
//		for(int i=0;i<array[0].length;i++) {
//			array[0][i]=num;
//			num++;
//		}
//		
//		for(int i=0;i<array[1].length;i++) {
//			array[1][i]=num;
//			num++;
//		}
//		for(int i=0;i<array[1].length;i++) {
//			array[2][i]=num;
//			num++;
//		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				array[i][j]=num;
				num++;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
