package com.app.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.bookshop.model.User;

public interface UserDao extends JpaRepository<User, Long> {

	
}
