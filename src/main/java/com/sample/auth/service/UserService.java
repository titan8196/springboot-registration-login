package com.sample.auth.service;

import com.sample.auth.model.User;

public interface UserService {
	void save(User user);

    User findByUsername(String username);
}
