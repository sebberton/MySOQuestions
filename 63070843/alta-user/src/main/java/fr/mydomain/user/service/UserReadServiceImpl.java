package fr.mydomain.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mydomain.user.mapper.UserMapper;
import fr.mydomain.user.model.User;

@Service
public class UserReadServiceImpl implements UserReadService {

	@Autowired
	private UserMapper userMapper;

	public User findById(Long id) {
		return userMapper.findById(id);
	}

}
