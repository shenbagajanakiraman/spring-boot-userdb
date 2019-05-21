package com.stackroute.userservice;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsException;

import java.util.List;

public interface UserService {

    public User saveUser (User user) throws UserAlreadyExistsException  ;
    public List<User> getAllUsers();

}
