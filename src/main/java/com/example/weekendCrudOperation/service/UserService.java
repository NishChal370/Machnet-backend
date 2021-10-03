package com.example.weekendCrudOperation.service;

import com.example.weekendCrudOperation.entity.User;
import com.example.weekendCrudOperation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
            return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    public  List<User> getUserByName(String name){
        return repository.findByName(name);
    }

    public String deleteUserById(int id){
        repository.deleteById(id);
        return "User deleted !!"+ id;
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setAddress(user.getAddress());
        existingUser.setNumber(user.getNumber());
        return repository.save(existingUser);
    }
}

