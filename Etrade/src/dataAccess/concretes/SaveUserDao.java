package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class SaveUserDao implements UserDao{
	public void add(User user) {
		System.out.println("kullan�c� sistemden kay�t oldu "+user.getEmail()+" adresine mail g�nderildi");
	}

}
