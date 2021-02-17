// 단락 회로 평가 실습하기
/* 단락 회로 평가 : 논리 곱 연산과 논리 합 연산을 할 때 두 항을 모두 실행하지 않더라도
 * 결과 값을 알 수 있는 경우에, 나머지 항은 실행되지 않는 것
 */

package chapter03;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1=num1+10)<10) && ((i=i+2)<10);
		System.out.println(value);		// false
		System.out.println(num1);		// 20
		// 논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i값 그대로
		System.out.println(i);			// 2
		
		value = ((num1=num1+10)>10)||((i=i+2)<10);
		System.out.println(value);		// true
		System.out.println(num1);		// 30
		// 논리 합에서 앞 항이 참이면 뒷 항이 실행되지 않아 i값 그대로
		System.out.println(i);			// 2
	}

}
