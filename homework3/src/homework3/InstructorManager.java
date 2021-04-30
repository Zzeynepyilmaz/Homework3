package homework3;

public class InstructorManager extends UserManager{
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + instructor.getCourse() + " kursunuz eklendi");
	}

}
