// 증가, 감소 연산자를 사용하여 값 연산하기

package chapter03;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;	// 게임에서 획득한 점수 : 150점
		
		// gameScore에 1만큼 더한 값을 lastScore1에 대입
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);		// 151
		
		// gameScore에서 1만큼 뺀 값을 lastScore2에 대입
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);		// 150
	}

}
