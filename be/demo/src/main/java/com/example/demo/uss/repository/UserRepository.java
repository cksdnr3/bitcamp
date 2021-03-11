package com.example.demo.uss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;

interface UserCustomRepository {
	
}
								// default jpa 객체와 custom 객체를 다중 상속 받는다.
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {

}
