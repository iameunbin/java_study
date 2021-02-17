// 조건 연산자를 사용하여 부모님의 나이 비교하기

package chapter03;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 53;
		int motherAge = 51;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
	}

}
