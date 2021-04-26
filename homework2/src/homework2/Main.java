package homework2;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(
				1,
				"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Engin Demiroð");
        Course course2=new Course(
        		2,
        		"Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)",
        		"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
        		"Engin Demiroð");
        Course course3=new Course(3,
        		"Programlamaya Giriþ için Temel Kurs",
        		"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
        		"Engin Demiroð");
        
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
