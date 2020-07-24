package fr.mydomain.user.service;

import fr.mydomain.user.model.User;

public interface UserReadService {
	User findById(Long id);
}
