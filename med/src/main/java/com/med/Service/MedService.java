package com.med.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.Model.User;
import com.med.Repository.medrepo;
@Service
public class MedService {
    @Autowired
    private medrepo medRepo;

    public User saveDetails(User user){
        return medRepo.save(user);

    }
    public java.util.List<User> getAllDetails(){
        return medRepo.findAll();
    }

}
