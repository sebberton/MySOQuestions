package fr.mydomain.user.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

	private Long id;

	public User(Long id) {
		this.id = id;
	}

}
