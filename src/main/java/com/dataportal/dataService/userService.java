package com.dataportal.dataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataportal.dataModel.User;
import com.dataportal.dataRepository.userRepository;

@Service
public class userService {
	
	@Autowired
	private userRepository userRepo;
	
	
	public User saveUser(User user) {

		return userRepo.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
		return userRepo.findByEmailId(email);
	}
	
	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return userRepo.findByEmailIdAndPassword(email,password);
	}

}
