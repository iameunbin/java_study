// 중첩된 반복문 - 구구단

package chapter04;

public class NestedLoop {

	public static void main(String[] args) {
		int i, j;
		int mul;
		
		for(i = 2; i <=9 ; i++) {
			for(j = 1; j <= 9; j++) {
				mul = i * j;
				System.out.println(i + "*" + j + "=" +  mul);
			}
			System.out.println();
		}
	}

}
