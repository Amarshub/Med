package com.med.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.med.Model.User;
import com.med.Service.MedService;

@RestController
public class MedController {
    @Autowired
    private MedService medService;

    @PostMapping("/adddata")
    public User postDetails(@RequestBody User user) {
        
        
        return medService.saveDetails(user);
    }
    
    @GetMapping("/getdata")
       
        
    public java.util.List<User> getDetails(){
        return medService.getAllDetails();
        }
    

    }
   
