package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.UserRepository;

public class InMemoryUserRepository implements UserRepository {
	private List<User> userList = new ArrayList<User>();
	private int nextId = 1;

	@Override
	public void saveUser(User user) {
		if (user.getId() == 0){
			user.setId(nextId);
			userList.add(user);
			nextId ++;
		} else {
			for (User currentUser : userList) {
				if(currentUser.getId() == user.getId()){
					userList.remove(currentUser);
					userList.add(user);
				}
			}
		}

	}

	@Override
	public void deleteUser(int userId) {
		for (User user : userList) {
			if (user.getId() == userId) {
				userList.remove(user);
			}
		}

	}

	@Override
	public User findUserById(int id) {
		for (User user : userList) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		return userList;
	}

}
