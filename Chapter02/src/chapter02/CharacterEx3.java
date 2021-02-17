// 문자형 변수에 숫자를 저장한다면?

package chapter02;

public class CharacterEx3 {

	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66;		// 문자형 변수에 음수를 넣으면 오류 발생
		
		System.out.println((char)a);
		System.out.println((char)b);	// 물음표 출력. 알 수 없는 문자라는 의미(음수 값을 대입했기 때문)
		System.out.println(a2);
	}

}