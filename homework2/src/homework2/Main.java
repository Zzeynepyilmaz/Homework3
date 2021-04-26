package homework2;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(
				1,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"Engin Demiro�");
        Course course2=new Course(
        		2,
        		"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT)",
        		"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
        		"Engin Demiro�");
        Course course3=new Course(3,
        		"Programlamaya Giri� i�in Temel Kurs",
        		"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
        		"Engin Demiro�");
        
        Course[] courses={course1,course2,course3};
        for (Course course : courses) {
			System.out.println(course.name);
		}
            
        CourseManager courseManager = new CourseManager();
        courseManager.courseAdd(course1);
        courseManager.courseAdd(course2);
        courseManager.courseAdd(course3);
        courseManager.courseDelete(course3);
        
        Category category=new Category(2, "Programlama");
        
        CategoryManager categoryManager=new CategoryManager();
        categoryManager.categoryAdd(category);
	}

}
