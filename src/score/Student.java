package score;

public class Student {
	private int studentId;
	private String studentName;
	Subject korean;
	Subject math;
	
	// 멤버변수를 가진 생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	// 국어 점수 설정 메서드
	public void setKoreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	// 수학 점수 설정 메서드
	public void setMathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	// 학생 정보 출력
	public void showInfo() {
		System.out.println(
				"Student No.: " + studentId +
				"\nName: " +  studentName +
				"\nKorean: " + korean.getScorePoint() +
				"\nMath: " + math.getScorePoint()
				);
	}
	
}
