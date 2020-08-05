package com.dxc.favouriteService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.favouriteService.domain.User;

@Repository
public interface CMatchRepository extends MongoRepository<User,String>{
	public User findByUserName(String userName);
}
