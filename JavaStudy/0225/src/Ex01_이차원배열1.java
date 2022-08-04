
public class Ex01_이차원배열1 {

	public static void main(String[] args) {
		
		//5행5열짜리 array라는ㄴ 이름의 2차원 배열을 만들고 싶어요!
		int[][] array = new int[5][5];
		//데이터를 1부터 25까지 넣어주세요
		int num=1;
		//num을 이용해서 1행에서 1~5까지 값을 넣어주세요!
		for(int i=0; i<array.length;i++) {
			for(int j =0; j<array[0].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+"\t"); // \t -> tab만큼 띄워라!
			}
			System.out.println();
		}
	
		
	}

}
