package chapter02;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';		// \uD55C == 한의 유니코드 값(16진수)
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}