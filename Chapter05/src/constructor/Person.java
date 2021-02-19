package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	/*
	 * 생성자는 주로 멤버 변수에 대한 값들을 매개변수로 받아서
	 * 인스턴스가 생성됨과 동시에 멤버 변수의 값을 지정하고 인스턴스를
	 * 초기화하기 위해 생성자를 직접 구현하여 사용
	 * */
	
	// 디폴트 생성자가 없으면 오류 발생 (생성자가 하나도 없을 때 디폴트 생성자가 제공 됨.) 따라서 직접 추가
	public Person() {}
	
	// 사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자
	public Person(String pname) {
		name = pname;
	}
	
	// 이름, 키, 몸무게를 매개변수로 입력받는 생성자
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
