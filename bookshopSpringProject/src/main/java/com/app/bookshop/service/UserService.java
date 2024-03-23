package com.app.bookshop.service;

import java.util.List;
import java.util.Optional;

import com.app.bookshop.model.User;

public interface UserService {

	User registerUser(User user);

	User getUser(long userId);

	List<User> getAllUser();

	Optional<User> deleteUser(String userId);

}
