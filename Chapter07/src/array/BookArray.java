// 객체 배열 만들기(2)

package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];	// Book 클래스형으로 객체 배열 생성(null로 초기화)
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}

}
