// �迭 ���̸�ŭ ����ϱ�

package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];	// double������ ���� 5�� �迭 ����
		
		data[0]=10.0;	// ù ��° ��ҿ� �� 10.0 ����
		data[1]=20.0;	// �� ��° ��ҿ� �� 20.0 ����
		data[2]=30.0;	// �� ��° ��ҿ� �� 30.0 ����
		
		// ��ü �迭 ���̸�ŭ �ݺ�
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);	// �״ټ���° ��Ҵ� �� ���� �������Ƿ� 0���
		}
	}

}
