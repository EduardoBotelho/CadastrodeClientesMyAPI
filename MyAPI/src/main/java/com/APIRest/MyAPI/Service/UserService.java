package com.APIRest.MyAPI.Service;


import com.APIRest.MyAPI.Repository.UserRepository;
import com.APIRest.MyAPI.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository appUserRepository;

    public List<AppUser> getAllUsers(){
        return appUserRepository.findAll();
    }
    public AppUser getUserById(Long id){
        return appUserRepository.findById(id).orElse(null);
    }
    public AppUser saveUser(AppUser user){
        return appUserRepository.save(user);
    }
    public void deleteUser(Long id){
        appUserRepository.deleteById(id);
    }
}
