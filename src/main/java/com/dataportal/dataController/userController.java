package com.dataportal.dataController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataportal.dataModel.User;
import com.dataportal.dataService.userService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class userController {


	@Autowired
	private userService userService;


	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception
	{
		String tempEmailId=user.getEmailId();
		
		if(tempEmailId !=null && !"".equals(tempEmailId)) {
			User userObj=userService.fetchUserByEmailId(tempEmailId);
			if(userObj!=null) {
				throw new Exception("user with "+tempEmailId+" is already exist");
				
			}
		}
		
		User userObj=null;
		userObj=userService.saveUser(user);
		return userObj;
		
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		String tempPass=user.getPassword();
		User userObj=null;
		if(tempEmailId!=null && tempPass!=null) {
			userObj=userService.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj==null) {
			throw new Exception("Bad Credentials");
			
		}
		return userObj;
	}


}
