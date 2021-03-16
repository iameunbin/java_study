// 이차원 배열 초기화하기

package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};	// 이차원 배열 선언과 동시에 초기화
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
