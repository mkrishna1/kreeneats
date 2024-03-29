package com.customerapp.kreeneats.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customerapp.kreeneats.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {

	UserDao findByUsername(String username);
}