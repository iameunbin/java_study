package classpart;

// �Լ� �ǽ�
public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// add() �Լ� ȣ��
		int add_num = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + add_num + " �Դϴ�");
		
		// sub() �Լ� ȣ��
		int sub_num = sub(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sub_num + " �Դϴ�");
		
		// mul() �Լ� ȣ��
		int mul_num = mul(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + mul_num + " �Դϴ�");
		
		// div() �Լ� ȣ��
		int div_num = div(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + div_num + " �Դϴ�");
	}
	
	// add �Լ� (FunctionTest Ŭ���� �ȿ� ������ ��. �ܺο��� package, import)
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	// sub �Լ�
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	// mul �Լ�
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	// div �Լ�
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

}
