package com.example.UserDetails.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserDetails.Model.User;
import com.example.UserDetails.Repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	 private UserRepository repository;
	
	public List<User> saveDetails(List<User> user) {
		return repository.saveAll(user);
	}

	public List<User> getDetails() {
		return repository.findAll();
	}

	public String deleteDetail(int id) {
        repository.deleteById(id);
        return id + " is removed !! " ;
	}

	public User updateDetails(User user) {
		User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setUsername(user.getUsername());
        existingUser.setPhno(user.getPhno());
        existingUser.setAddress(user.getAddress());
        return repository.save(existingUser);
	}


}
