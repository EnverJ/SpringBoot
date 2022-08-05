package Enlem.Ezmet2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userController {
	@GetMapping
	public String getUsers() {

		return "http GET request was sent";
	}
	@GetMapping(path="/{userID}")
	public String getUser(@PathVariable String usrID) {

		return "http GET request was sent";
	}


	@PostMapping
	public String createUsers() {

		return "http POST request was sent";
	}

	@PutMapping
	public String updateUsers() {

		return "http PUT request was sent";
	}

	@DeleteMapping
	public String deleteUsers() {

		return "http DELTE request was sent.   ";
	}

}
