
public class Ex014가지연산 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		int sum = num1+num2;
		int minus = num1-num2;
		int mul = num1*num2;
		double div = (double)num1/num2; //앞에 (double)을 넣어서 한시적으로 실수형으로 바꿈
		//num1과 num2 더하기, 빼기, 곱하기, 나누기결과 출력
//		System.out.println(num1 + num2);
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
		
//		System.out.println(sum);
//		System.out.println(minus);
//		System.out.println(mul);
//		System.out.println(div);

		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 결과 : " + div);
	}

}
