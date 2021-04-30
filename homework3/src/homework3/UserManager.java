package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ " isimli kullanýcý kayýt edildi! ");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+ "isimli kullanýcýnýn kaydý silindi");
	}

}
