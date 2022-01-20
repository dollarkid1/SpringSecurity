package com.oneplug.springsecurity.repository;

import com.oneplug.springsecurity.data.models.ERole;
import com.oneplug.springsecurity.data.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository <Role, String> {
    Optional<Role> findByName(ERole name);
}

