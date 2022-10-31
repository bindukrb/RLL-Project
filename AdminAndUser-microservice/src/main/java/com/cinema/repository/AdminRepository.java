package com.cinema.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Admin;


@Repository("adminRepository")
@Scope("singleton")
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
