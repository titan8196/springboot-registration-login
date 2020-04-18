package com.sample.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
