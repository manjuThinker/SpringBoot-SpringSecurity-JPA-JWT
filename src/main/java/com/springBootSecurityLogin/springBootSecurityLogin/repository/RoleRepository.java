package com.springBootSecurityLogin.springBootSecurityLogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootSecurityLogin.springBootSecurityLogin.models.ERole;
import com.springBootSecurityLogin.springBootSecurityLogin.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}