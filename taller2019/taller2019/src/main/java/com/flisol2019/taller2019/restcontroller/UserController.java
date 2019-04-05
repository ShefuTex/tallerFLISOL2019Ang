/**
 * 
 */
package com.flisol2019.taller2019.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flisol2019.taller2019.obj.User;

/**
 * @author tejo8003
 *
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	
	private  List<User> lista = new ArrayList<>(); 
	
	
	public UserController() {
		lista.add(new User("Pedro","pedro@gmail.com",new Random(System.currentTimeMillis()).nextInt(50)));
		lista.add(new User("Luis","luis@gmail.com",new Random(System.currentTimeMillis()).nextInt(15)));
		lista.add(new User("Laura","laura@gmail.com",new Random(System.currentTimeMillis()).nextInt(17)));
		lista.add(new User("Mayra","mayra@gmail.com",new Random(System.currentTimeMillis()).nextInt(25)));
		lista.add(new User("Lurdes","lurdes@gmail.com",new Random(System.currentTimeMillis()).nextInt(19)));
	}

	/**
	 * Get all users list.
	 *
	 * @return the list
	 */
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return lista;
	}

	/**
	 * Gets users by id.
	 *
	 * @param userId the user id
	 * @return the users by id
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@GetMapping("/users/{email}")
	public User getUsersById(@PathVariable(value = "email") String userEmail) {
		User user = new User();
		
		lista.forEach(userFor -> {
			if (userFor.getCorreo().equals(userEmail)) {
				user.setEdad(userFor.getEdad());
				user.setNombre(userFor.getNombre());
				user.setCorreo(userEmail);
			}
		});

		return user;
	}

	/**
	 * Create user user.
	 *
	 * @param user the user
	 * @return the user
	 */
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		lista.add(user);
		return user;
	}

	/**
	 * Update user response entity.
	 *
	 * @param userId      the user id
	 * @param userDetails the user details
	 * @return the response entity
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@PutMapping("/users")
	public User updateUser(
			@Valid @RequestBody User userDetails)  {
		int index = -1;
		User userupdate = new User();
		
		for (int i = 0; i < lista.size();  i++) {
			if (lista.get(i).getCorreo().equals(userDetails.getCorreo())) {
				lista.get(i).setNombre(userDetails.getNombre());
				lista.get(i).setEdad(userDetails.getEdad());
				lista.get(i).setCorreo(userDetails.getCorreo());
				i = lista.size();
			}
		}
		
		return userupdate;
	}

	/**
	 * Delete user map.
	 *
	 * @param userId the user id
	 * @return the map
	 * @throws Exception the exception
	 */
	@DeleteMapping("/user/{email}")
	public Boolean deleteUser(@PathVariable(value = "email") String userMail) throws Exception {
		boolean index = false;
		
		for (int i = 0; i < lista.size();  i++) {
			if (lista.get(i).getCorreo().equals(userMail)) {
				lista.remove(i);
				i = lista.size();
				index = true;
			}
		}
		
		
		return index;
	}
}