package 메소드;

public class Ex02_메소드4 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 25;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}
	public static int close10(int num1, int num2) {
		//각각 10과의 거리를 알아야함..
		int result = 0; //10과 더 가까운 수를 담아줄 변수
		
		int resultNum1 = 10- num1;
		int resultNum2 = 10- num2;
		
		if(resultNum1<0) {
			resultNum1 = -1*resultNum1;
		}
		if(resultNum2<0) {
			resultNum2 = -1*resultNum2;
		}
		//***(막혔던곳) 미리 변수를 만들어서 절댓값을 만들어야 비교가 가능함***
		
		if(resultNum1 > resultNum2) {
			result = num2;
		} else if(resultNum1 < resultNum2) {
			result = num1;
		}
//		if((10-num1)*(10-num1) < (10-num2)*(10-num2)) {
//			result = num1;
//		}
//		else if((10-num1)*(10-num1)>(10-num2)*(10-num2)) {
//			result = num2;
//		}else
//			result = 0;
		return result;
	}
}
