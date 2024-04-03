package com.med.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.med.Model.User;

public interface medrepo extends JpaRepository<User,Integer> {
    
}
