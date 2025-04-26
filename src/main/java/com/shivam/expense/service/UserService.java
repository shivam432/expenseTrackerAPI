package com.shivam.expense.service;

import com.shivam.expense.entity.User;
import com.shivam.expense.exception.EtAuthException;

public interface UserService {

	public User validateUser(String email, String password) throws EtAuthException;
	
	public User registerUser(User user) throws EtAuthException;
	
	public User getUserById(Integer id) throws EtAuthException;
	
}
