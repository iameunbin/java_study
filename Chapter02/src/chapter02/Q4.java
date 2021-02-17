// 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력하시오

package chapter02;

public class Q4 {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 2.0;
		
		System.out.println("num1 + num2 = "+ (num1+(int)num2));
		System.out.println("num1 - num2 = "+ (num1-(int)num2));
		System.out.println("num1 * num2 = "+ (num1*(int)num2));
		System.out.println("num1 / num2 = "+ (num1/(int)num2));
	}

}
