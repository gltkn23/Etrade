package business.concretes;

import business.abstracts.UserServiceIn;
import entities.concretes.User;

public class UserManagerIn implements UserServiceIn{
	@Override
	public void signIn(User user) {	
		if(user.getEmail()==user.getEmail()&& user.getPassword()==user.getPassword()) {
			System.out.println("sisteme giri� yap�ld� ho� geldiniz");
			return;
			
		}
		System.out.println("hatal� �ifre veya kullan�c� ad�");
	
	}
	
	

}
