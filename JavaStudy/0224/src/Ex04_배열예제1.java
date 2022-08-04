
public class Ex04_배열예제1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		//출력문만 가지고
		//짝수만 출력!
//		System.out.println(arr[1]);
//		System.out.println(arr[3]);
//		System.out.println(arr[5]);
//		System.out.println(arr[7]);
//		System.out.println(arr[9]);
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		//배열의 크기를 구해오는건 .length !
	}

}
