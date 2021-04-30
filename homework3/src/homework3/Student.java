package homework3;

public class Student extends User{
	private String course;

	public Student() {
	}

	public Student(String course) {
		super();
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
