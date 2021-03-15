/* 
 * static 변수 테스트하기
 * 
 * serialNum이 증가했을 때 두 인스턴스에서 증가된 값이 공유되는 지 확인
 */
package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);	// serialNum 변수의 초깃값 출력
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		// 증가된 값 출력
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
