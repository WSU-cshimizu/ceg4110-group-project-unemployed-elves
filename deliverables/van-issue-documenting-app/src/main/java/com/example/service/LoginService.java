package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean validateUser(String name, String surname, String driverID, String phoneNumber) {
        User user = userRepository.findByDriverID(driverID).orElse(null);
        if (user != null && user.getFirstName().equalsIgnoreCase(name)
                && user.getLastName().equalsIgnoreCase(surname)
                && user.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
            return true;
        }
        return false;
    }
}
