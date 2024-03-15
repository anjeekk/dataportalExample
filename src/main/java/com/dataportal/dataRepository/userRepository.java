package com.dataportal.dataRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataportal.dataModel.User;

public interface userRepository extends JpaRepository<User, Integer> {

	public User findByEmailId(String email);

	public User findByEmailIdAndPassword(String email, String password);

}
