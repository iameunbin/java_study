// 나이에 따라 다른 문장 출력하기

package chapter04;

public class ifexample {

	public static void main(String[] args) {
		int age = 7;
		
		if(age >= 8)
			System.out.println("학교에 다닙니다");
		else	// age < 8
			System.out.println("학교에 다니지 않습니다");
	}

}
