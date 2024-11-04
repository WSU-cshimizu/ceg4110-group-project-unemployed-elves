package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
//mock up method
    public boolean validateUser(String name, String surname, String driverID, String phone) {
        return name.equalsIgnoreCase("maria")
                && surname.equalsIgnoreCase("loz")
                && driverID.equals("123456")
                && phone.equals("(111) 111-1111") ;
    }
}
