package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class GmailUserDao implements UserDao {
	public void add(User user) {
		System.out.println("kullan�c� gmail yoluyla kay�t oldu "+user.getName());
	}

}
