package kodlamaIoJava2;

public class Instructor extends User {
  int instructorId;
  String instructorDetail;
  
  public Instructor() {
	  
  }
  
  
public Instructor(int instructorId, String instructorDetail) {
	
	this.instructorId = instructorId;
	this.instructorDetail = instructorDetail;
}


public int getInstructorId() {
	return instructorId;
}


public void setInstructorId(int instructorId) {
	this.instructorId = instructorId;
}


public String getInstructorDetail() {
	return instructorDetail;
}


public void setInstructorDetail(String instructorDetail) {
	this.instructorDetail = instructorDetail;
}
}
