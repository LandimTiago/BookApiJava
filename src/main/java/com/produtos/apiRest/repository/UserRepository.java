package com.produtos.apiRest.repository;

import com.produtos.apiRest.models.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

}
