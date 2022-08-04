
public class Ex11_switch_case {

	public static void main(String[] args) {
		
		int num = 40;

		//switch(기준값)
		//	case value: ==> 기준값이랑 value 비교해서 같다면 실행시키세요! 
		// 실행 문장을 {} 로 묶어 주지 않는다!!
		// case에서 한번 True 로 나온 순간 밑에를 전부 True 로 인식함!!
		switch (num) {
		case 10:
			System.out.println("10이 들어있습니다!");
			break;
			//분기문 -> break; // 여기까지 하고 빠져나와주세요(해당구문을 끝내 주세요)
		case 20:
			System.out.println("20이 들어있습니다!");
			break;
		case 30:
			System.out.println("30이 들어있습니다!");
			break;
		
		default : //다중 if 문의 else 에 해당됨
			//switch case문에 들어오면 기본으로 이건 해주세요!
			System.out.println("10 20 30아닙니다");
		
		}
	}

}
