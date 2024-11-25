package com.example.service;
import com.example.model.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

//NEED TO BE REWRITTEN
@ExtendWith(MockitoExtension.class)
class LoginServiceTest {
    /*
    @InjectMocks
    LoginService loginService;
    @Mock
    UserRepository userRepository;

    private User mockUser;

    @BeforeEach
    public void settingMockUser(){
        mockUser = new User();
        mockUser.setDriverID("A223344");
        mockUser.setFirstName("Alex");
        mockUser.setLastName("Xu");
        mockUser.setPhoneNumber("6134442233");
    }

    @Test
    void validateUser_correctData(){
        String driverID = "A223344";
        String firstName = "Alex";
        String lastName = "Xu";
        String phoneNumber = "6134442233";
        Mockito.when(userRepository.findById(Long.valueOf(driverID))).thenReturn(Optional.of(mockUser));
        Assertions.assertTrue(loginService.validateUser(firstName, lastName, driverID, phoneNumber));
    }
    @Test
    void validateUser_incorrectLastName(){
        String driverID = "A223344";
        String firstName = "Alex";
        String lastName = "Ux";
        String phoneNumber = "6134442233";
        Mockito.when(userRepository.findById(Long.valueOf(driverID))).thenReturn(Optional.of(mockUser));
        Assertions.assertFalse(loginService.validateUser(firstName, lastName, driverID, phoneNumber) );
    }
    @Test
    void validateUser_incorrectPhoneNumber(){
        String driverID = "A223344";
        String firstName = "Alex";
        String lastName = "Xu";
        String phoneNumber = "1644442233";
        Mockito.when(userRepository.findById(Long.valueOf(driverID))).thenReturn(Optional.of(mockUser));
        Assertions.assertFalse(loginService.validateUser(firstName, lastName, driverID, phoneNumber) );
    }
    @Test
    void validateUser_incorrectDriverID(){
        String driverID = "B223344";
        String firstName = "Alex";
        String lastName = "Xu";
        String phoneNumber = "6144442233";
        Mockito.when(userRepository.findById(Long.valueOf(driverID))).thenReturn(Optional.of(mockUser));
        Assertions.assertFalse(loginService.validateUser(firstName, lastName, driverID, phoneNumber) );
    }

    @Test
    void validateUser_caseInsensitivity(){
        // Precondition: We check everything except driver ID. DriverID is always in UpperCase.
        // in integration testing it will be resolved because columns collision are case insencitive.
        String driverID = "A223344";
        String firstName = "alEx";
        String lastName = "xu";
        String phoneNumber = "6134442233";
        Mockito.when(userRepository.findById(Long.valueOf(driverID))).thenReturn(Optional.of(mockUser));
        Assertions.assertTrue(loginService.validateUser(firstName, lastName, driverID, phoneNumber));
    } */
}
