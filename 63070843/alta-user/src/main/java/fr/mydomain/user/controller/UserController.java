package fr.mydomain.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mydomain.user.model.User;
import fr.mydomain.user.service.UserReadService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserReadService userReadService;

	@GetMapping(path = { "/{id}" })
	public User findById(Long id) {
		return userReadService.findById(id);
	}
}
