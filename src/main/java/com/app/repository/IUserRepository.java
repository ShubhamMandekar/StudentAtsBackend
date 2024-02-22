package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Role;
import com.app.entities.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends JpaRepository<User, Long> {

	public boolean existsByEmail(String email);

	public User findByEmail(String email);

	public List<User> findByRole(Role role);


	public User findByid(Long id);
	@Modifying
	@Query("update User u set u.attended_lectures=?2 where u.id=?1")
	public void incattendance(Long id,int inc);

	@Modifying
	@Query("update User u set u.attended_lectures=?2 where u.id=?1")
	public void decattendance(Long id,int inc);




}
