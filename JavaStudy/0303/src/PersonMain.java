import java.util.ArrayList;

public class PersonMain {

	

	public static void main(String[] args) {
		
		
		//Person() : 생성자
		//클래스만큼의 공간을 어디에?? 객체에 할당해준다!!
		Person p1 = new Person("승환",20,173,70);
		//p1에 대한 승환을 '임짜장'으로 개명 하고 싶습니다
		p1.setName("임짜장");
//		p1.name="승환";
//		p1.age=20;
//		p1.tall=173;
//		p1.weight=70;
//		System.out.println("이름 : " +p1.getName());

		//형쌤 객체
		Person p2 = new Person();
		p2.setName("형쌤");
		System.out.println("이름2 : "+p2.getName());
		//형쌤에 대한 객체를 완성해주세요!-->각각의 필드값에 데이터를 전부 넣어주세요!
		//데이터 다 넣었다면 형쌤에 대한 정보를 출력 시켜주세요!
		p2.setAge(21);
		System.out.println("나이2 : " +p2.getAge());
		p2.setTall(177);
		System.out.println("키2 : "+p2.getTall());
		p2.setWeight(77);
		System.out.println("몸무게2 : "+p2.getWeight());
		
		p2.getData();
		
		
		Person p3 = new Person();
		p3.setName("훈정");
		p3.setAge(22);
		p3.setTall(173);
		p3.setWeight(70);
		
		Person p4 = new Person();
		p4.setName("정훈");
		p4.setAge(23);
		p4.setTall(170);
		p4.setWeight(50);
		
		
		
		
//		int[] numArray = {num1,20,30}
		//데이터를 한번에 다룰수 있는 방법! -> 배열
		//(객체) 배열 선언
		//데이터타입[] 배열명 = new 데이터타입[3];
		Person[] pArray = new Person[4];
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		
		//pArray를 사용해서 승환쌤의키를 출력 시키고 싶어요!
		//pArray[0] ==> p1
		p1.getTall();
		pArray[0].getTall();
		System.out.println("승환쌤 키 : " + pArray[0].getTall());
		//pArray를 사용해서 형쌤의 나이를 출력해주세요
		pArray[1].getAge();
		System.out.println("형썜 나이 : " + pArray[1].getAge());
		
		//pArray를 사용해서 선생님들의 평균 나이를 출력 시켜주세요!
		pArray[0].getAge();
		pArray[1].getAge();
		pArray[2].getAge();
		pArray[3].getAge();
		
		int sum = 0;
		for(int i=0;i<pArray.length;i++) {
			sum += pArray[i].getAge();
		}
		System.out.println("나이 평균 : " + sum/pArray.length);
		
		//선생님들의 이름을 전부 출력해주세요!
		for(int i=0;i<pArray.length;i++) {
			System.out.println("이름 : " + pArray[i].getName());
		}
		
		
		//승환썜, 형썜, 동원쌤, 수민쌤 --pArray
		//자연쌤 --> pArray에 추가 하고 싶습니다!!
		
		//배열의 한계 : 이미 크기를 정해져 버려서 데이터를 추가하거나 배열의 크기를 바꿀수 없다!
		//배열의 한계를 뛰어 넘는 배열 : ArrayList
		//선생님들의 객체를 담을 수 있는 ArrayList
		ArrayList<Person> pArrayList = new ArrayList<Person>();
		pArrayList.add(p1);
		pArrayList.add(p2);
		pArrayList.add(p3);
		pArrayList.add(p4);
		
		//pArrayList를 사용해서 승환쌤에 대한 정보를 출력하고 싶어요!
		//이름 : 
		//나이 : 
		// 키 :
		//몸무게 : 
		//객체 어레이리스트
		System.out.println("이름 : " + pArrayList.get(0).getName()); //마지막 .getName()을 넣어줘야함!
		System.out.println("나이 : " + pArrayList.get(0).getAge());
		System.out.println("키 : " + pArrayList.get(0).getTall());
		System.out.println("몸무게 : " + pArrayList.get(0).getWeight());
		
		//pArrayList를 사용해서 선생님들에 대한 정보를 전부 출력시켜주세요!
		for(int i =0; i<pArrayList.size();i++) {
			System.out.println("이름 : " + pArrayList.get(i).getName()); 
			System.out.println("나이 : " + pArrayList.get(i).getAge());
			System.out.println("키 : " + pArrayList.get(i).getTall());
			System.out.println("몸무게 : " + pArrayList.get(i).getWeight());
		}
		
		
		
		
	}

}
