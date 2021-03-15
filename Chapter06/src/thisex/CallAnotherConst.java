package thisex;

class Person{
	String name;
	int age;
	
	// 디폴트 생성자 (초기값)
	Person(){
		this("이름 없음", 1);		// this를 사용해 Person(String, int) 생성자 호출
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		// 디폴트 생성자 호출
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
