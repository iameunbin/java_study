// for문 예제

package chapter04;

public class ForExample1 {

	public static void main(String[] args) {
		int num, sum = 0;
		
		for(num = 1;num <= 10;num++) {
			sum += num;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
