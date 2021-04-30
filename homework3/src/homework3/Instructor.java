package homework3;

public class Instructor extends User {
	private String description;
	private String course;
	
	public Instructor() {
		
	}

	public Instructor(String description, String course) {
		super();
		this.description = description;
		this.course = course;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	
}
