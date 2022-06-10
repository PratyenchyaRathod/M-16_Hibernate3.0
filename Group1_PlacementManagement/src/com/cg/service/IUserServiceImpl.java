package com.cg.service;

import com.cg.entities.User;
import com.cg.repository.IUserRepository;
import com.cg.repository.IUserRepositoryImpl;


public class IUserServiceImpl implements IUserService{
	
	// Step 1; Establishing connection between Service and Repo
		private IUserRepository dao;
		
		public IUserServiceImpl()
		{
			dao = new IUserRepositoryImpl();
		}
		
	//Step 2: Service calls to perform CRUD Operation
	
	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();

		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();

		return user;
	}
	
	@Override
	public User login(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public boolean logOutUser() {
		return false;
	}

	

}
