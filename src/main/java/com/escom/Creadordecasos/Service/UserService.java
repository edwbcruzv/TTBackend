package com.escom.Creadordecasos.Service;

import com.escom.Creadordecasos.Entity.User;
import com.escom.Creadordecasos.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findUserByUsername( String username) {
        return userRepository.findByUsername( username );
    }

    public User createUser( User user ) {
        return userRepository.save( user );
    }

}
