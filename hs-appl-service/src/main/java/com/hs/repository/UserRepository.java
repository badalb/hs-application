package com.hs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hs.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
