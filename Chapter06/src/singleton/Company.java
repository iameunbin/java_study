/*
 * 싱글톤 패턴으로 회사 클래스 구현하기
 * 
 * 1단계 : private 생성자 만들기
 * 2단계 : 클래스 내부에 static으로 유일한 인스턴스 생성하기
 * 3단계 : 외부에서 참조할 수 있는 public 메서드 만들기
 */

package singleton;

public class Company {

	private static Company instance = new Company();	// 유일하게 생성한 인스턴스
	private Company() {}
	
	// 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;	// 유일하게 생성한 인스턴스 반환
	}
}
