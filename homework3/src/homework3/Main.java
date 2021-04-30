package homework3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Zeynep");
		student1.setLastName("Yýlmaz");
		student1.setEmail("zeynep@gmail.com");
		student1.setPassword("123456789");
		student1.setCourse("Java + React Kampý");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@gmail.com");
		instructor.setPassword("987654321");
		instructor.setDescription("MCT,PMP,ITIL");
		instructor.setCourse("Java + React Kampý");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.rollCall(student1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor);
		instructorManager.addCourse(instructor);

	}

}
