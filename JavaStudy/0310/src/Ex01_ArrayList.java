import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		
		//배열의 한계 : 이미 크기를 정해져 버려서 데이터를 추가하거나 배열의 크기를 바꿀수 없다!
		//배열의 한계를 뛰어 넘는 배열 : ArrayList
		
		//내가 사용하고자 하는 데이터의 갯수를 정확히 모를때 문제!
		int[] array = {10,20,30,40,50};
		//30이라는 숫자가 필요 없어요!
		array[2]=0;
		System.out.println(array.length);

		//ArrayList 선언 방식
		//ArrayList<배열에 들어갈 데이터의 타입> 어레이리스트명 = new ArrayList<String>();
		//ArrayList에 들어가는 타입은 레퍼런스 타입만 가능하다!(기본자료형 타입은 쓸수 없다!)
		//기본 데이터 타입으로 ArrayList를 만들어주기 위해서는
		//기본데이터 타입을 표현 할 수 있는 클래스를 활용해주면 된다!
		//int -> Interger
		ArrayList<String> nameArray = new ArrayList<String>();
		
		
		//데이터 추가 .add("넣고 싶은 데이터") ->데이터 입력한 순서대로 배열에 들어간다
		//즉 맨뒤로 차곡차곡 쌓인다
		nameArray.add("승환쌤");
		nameArray.add("형쌤");
		nameArray.add("동원쌤");
		nameArray.add("수민쌤");
		nameArray.add("자연쌤");
		
		
		//데이터 출력 -> get(인덱스번호)
		//승환쌤 출력
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		System.out.println(nameArray.get(2));
		System.out.println(nameArray.get(3));
		System.out.println(nameArray.get(4));
		
		
		//ArrayList 크기 -> size() == 일반 배열에서의 length와 같음!
		for(int i =0; i<nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
		//데이터 삭제 .remove(지우고싶은 인덱스번호)
		//어떤 특정 조건에서 해당하는 데이터만 지우고싶을때!
		nameArray.remove(2);
		
		System.out.println(nameArray.size());
		
		//데이터 삽입! -> .add(데이터가 들어갈 인덱스 위치, "넣고싶은데이터")
		nameArray.add(1, "동명");
		nameArray.add(4, "주란");
		for(int i =0; i<nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
	}

}
