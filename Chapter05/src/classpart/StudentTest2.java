package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "이은빈";
		
		Student student2 = new Student();
		student2.studentName = "성지우";
		
		// 참조 변수 값 출력 (클래스 이름@인스턴스의 메모리 주소)
		System.out.println(student1);
		System.out.println(student2);
	}

}
