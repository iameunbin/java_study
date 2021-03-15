package thisex;

class Person2{
	String name;
	int age;
	
	Person2(){
		this("이름 없음", 1);		// this를 사용해 밑의 Person(String, int) 생성자 호출
	}
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person2 returnItSelf() {
		return this;			// this 반환
	}
}

public class CallAnotherCont {

	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person2 p = noName.returnItSelf();	// this 값을 클래스 변수에 대입
		System.out.println(p);				// noName.returnSelf()의 반환 값 출력
		System.out.println(noName);			// 참조 변수 출력
	}

}
