package thisex;

class Person{
	String name;
	int age;
	
	// ����Ʈ ������ (�ʱⰪ)
	Person(){
		this("�̸� ����", 1);		// this�� ����� Person(String, int) ������ ȣ��
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		// ����Ʈ ������ ȣ��
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
