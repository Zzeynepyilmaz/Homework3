package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ " isimli kullan�c� kay�t edildi! ");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+ "isimli kullan�c�n�n kayd� silindi");
	}

}
