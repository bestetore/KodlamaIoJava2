package kodlamaIoJava2;

public class StudentManager extends UserManager {

	public void joinCourse(Student student) {
		System.out.println("Kursa kayıt olundu");
	}
	
	
	public void confirmAttendance(Student student) {
		System.out.println("Yoklamanız alındı. Derse geri dönebilirsiniz :)");
	}
}
