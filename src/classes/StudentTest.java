package classes;

public class StudentTest {
	public static void main(String[] args) {  // static: 메모리의 한 부분을 사용하겠다.
		//클래스 인스턴스 =  생성자
		Student st1 = new Student();
		Student st2 = new Student(1002, "이정우", 1);
		
		// 멤버 변수 / 값 입력 
		st1.studentId = 1001;
		st1.name = "김기용";
		st1.grade = 2;
		
		// 출력 
//		System.out.println("학번: " + st1.studentId);
//		System.out.println("이름: " + st1.name);
//		System.out.println("학년: " + st1.grade);
		st1.displayInfo();

	}
}


