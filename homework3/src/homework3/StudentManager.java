package homework3;

public class StudentManager extends UserManager{
	public void rollCall(Student student) {
		System.out.println(student.getFirstName()+ " yoklamanýz alýndý. Derse dönebilirsiniz");
	}

}
