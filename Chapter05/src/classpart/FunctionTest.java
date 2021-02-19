package classpart;

// 함수 실습
public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// add() 함수 호출
		int add_num = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + add_num + " 입니다");
		
		// sub() 함수 호출
		int sub_num = sub(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sub_num + " 입니다");
		
		// mul() 함수 호출
		int mul_num = mul(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + mul_num + " 입니다");
		
		// div() 함수 호출
		int div_num = div(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + div_num + " 입니다");
	}
	
	// add 함수 (FunctionTest 클래스 안에 만들어야 됨. 외부에는 package, import)
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	// sub 함수
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	// mul 함수
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	// div 함수
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

}
