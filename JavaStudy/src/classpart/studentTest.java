package classpart;

public class studentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		// 멤버 변수 사용
		System.out.println(student1.studentName);
		// 메서드 사용
		System.out.println(student2.getStudentName());


	}

}
