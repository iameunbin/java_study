package constructor;

public class PersonTest {
	public static void main(String[] args) {
		/* 
		 * Person() : 생성자
		 * 생성자가 하는 일 : 클래스를 처음 만들 때 멤버 변수나 상수를 초기화하는 것
		 * */
		
		// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		// 인스턴스 변수 초기화와 동시에 클래스 생성
		Person personLee = new Person("이순신", 175, 75);
	}
}
