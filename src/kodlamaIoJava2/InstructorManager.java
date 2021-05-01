package kodlamaIoJava2;

public class InstructorManager extends UserManager{
   public void addCourse(Instructor instructor) {
	   System.out.println("Kurs eklendi");
   }
   
   public void removeCourse(Instructor instructor) {
	   System.out.println("Kurs kaldırıldı");
   }
}
