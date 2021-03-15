package thisex;

class Person2{
	String name;
	int age;
	
	Person2(){
		this("�̸� ����", 1);		// this�� ����� ���� Person(String, int) ������ ȣ��
	}
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person2 returnItSelf() {
		return this;			// this ��ȯ
	}
}

public class CallAnotherCont {

	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person2 p = noName.returnItSelf();	// this ���� Ŭ���� ������ ����
		System.out.println(p);				// noName.returnSelf()�� ��ȯ �� ���
		System.out.println(noName);			// ���� ���� ���
	}

}
