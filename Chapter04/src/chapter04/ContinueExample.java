// continue문 예제 - 홀수만 더하기

package chapter04;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0)	// num이 짝수인 경우
				continue;		// 이후 수행을 생략하고 num++ 수행
			total += num;
		}
		
		System.out.println("1부터 100까지의 홀수의 합 : " + total + " 입니다.");
	}

}
