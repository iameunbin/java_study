package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	/*
	 * �����ڴ� �ַ� ��� ������ ���� ������ �Ű������� �޾Ƽ�
	 * �ν��Ͻ��� �����ʰ� ���ÿ� ��� ������ ���� �����ϰ� �ν��Ͻ���
	 * �ʱ�ȭ�ϱ� ���� �����ڸ� ���� �����Ͽ� ���
	 * */
	
	// ����Ʈ �����ڰ� ������ ���� �߻� (�����ڰ� �ϳ��� ���� �� ����Ʈ �����ڰ� ���� ��.) ���� ���� �߰�
	public Person() {}
	
	// ��� �̸��� �Ű������� �Է¹޾Ƽ� Person Ŭ������ �����ϴ� ������
	public Person(String pname) {
		name = pname;
	}
	
	// �̸�, Ű, �����Ը� �Ű������� �Է¹޴� ������
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
