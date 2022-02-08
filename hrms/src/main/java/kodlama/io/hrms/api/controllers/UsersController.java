package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;
	
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/add")
	public void add(User user) {
		userService.add(user);
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		return this.userService.getAll();
	}
}
