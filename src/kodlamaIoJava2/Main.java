package kodlamaIoJava2;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		User user1 = new User(1, "Can", "Dural", "candural@outlook.com");
		
		Instructor engin = new Instructor();
		engin.setId(1);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
		engin.setEmail("engindemirog@outlook.com");
		engin.setInstructorDetail("Yazılım geliştirmeye lisede yazılım bölümünde okurken başladım...");
		
		
		Student ogrenci = new Student();
		ogrenci.setStudentId(1);
		ogrenci.setFirstName("Beste");
		ogrenci.setLastName("Töre");
		ogrenci.setEmail("bestetore@outlook.com");
		
	
		UserManager userManager = new UserManager();
		userManager.signIn(user1);
		userManager.signOut(user1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(engin);
		instructorManager.removeCourse(engin);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.confirmAttendance(ogrenci);
		studentManager.joinCourse(ogrenci);
		

	}

}
