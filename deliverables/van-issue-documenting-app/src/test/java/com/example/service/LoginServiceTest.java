package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;


@ExtendWith(MockitoExtension.class)
class LoginServiceTest {

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
    void validateUser_correctData() {
        String driverID = "A223344";
        String firstName = "Alex";
        String lastName = "Xu";
        String phoneNumber = "6134442233";
        Mockito.when(userRepository.findByDriverID(driverID)).thenReturn(Optional.of(mockUser));
        Assertions.assertTrue(loginService.validateUser(firstName, lastName, driverID, phoneNumber));
    }
    @Test
    void validateUser_incorrectLastName() {
        String driverID = "A223344";
        String firstName = "Alex";
        String lastName = "Ux";
        String phoneNumber = "6134442233";
        Mockito.when(userRepository.findByDriverID(driverID)).thenReturn(Optional.of(mockUser));
        Assertions.assertFalse(loginService.validateUser(firstName, lastName, driverID, phoneNumber));
    }

    @Test
    void validateUser_incorrectPhoneNumber() {
        String driverID = "A223344";
        String firstName = "Alex";
        String lastName = "Xu";
        String phoneNumber = "1644442233";
        Mockito.when(userRepository.findByDriverID(driverID)).thenReturn(Optional.of(mockUser));
        Assertions.assertFalse(loginService.validateUser(firstName, lastName, driverID, phoneNumber));
    }

    @Test
    void validateUser_incorrectDriverID() {
        String driverID = "B223344";
        String firstName = "Alex";
        String lastName = "Xu";
        String phoneNumber = "6134442233";
        Mockito.when(userRepository.findByDriverID(driverID)).thenReturn(Optional.empty());
        Assertions.assertFalse(loginService.validateUser(firstName, lastName, driverID, phoneNumber));
    }

    @Test
    void validateUser_caseInsensitivity() {
        String driverID = "A223344";
        String firstName = "alEx";
        String lastName = "xu";
        String phoneNumber = "6134442233";
        Mockito.when(userRepository.findByDriverID(driverID)).thenReturn(Optional.of(mockUser));
        Assertions.assertTrue(loginService.validateUser(firstName, lastName, driverID, phoneNumber));
    }

}
