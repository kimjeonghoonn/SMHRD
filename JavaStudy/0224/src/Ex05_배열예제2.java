
public class Ex05_배열예제2 {

	public static void main(String[] args) {
		
		int[] arr = {43,15,5,20,13,35,31,17,47,8};
		// arr배열 안에서 최댓값(제일 큰 값) 출력
		// 비교할 기준 선정
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length;i++) {
			//내가 가졌던 기준점 max랑 arr안에 있는 숫자들을
			//하나씩 꺼내보면서 비교를
			// max보다 큰값이 최댓값 max 저장
			if(max<arr[i]) {
				max=arr[i];
				}
			if(min>arr[i]) {
				min = arr[i];
			}
			}//출력문을 통해 max값 출력
		System.out.println(max);
		System.out.println(min);
		}
		

}

