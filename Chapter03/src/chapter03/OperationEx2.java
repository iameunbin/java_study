// ����, ���� �����ڸ� ����Ͽ� �� �����ϱ�

package chapter03;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;	// ���ӿ��� ȹ���� ���� : 150��
		
		// gameScore�� 1��ŭ ���� ���� lastScore1�� ����
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);		// 151
		
		// gameScore���� 1��ŭ �� ���� lastScore2�� ����
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);		// 150
	}

}
