package com.example.controller;

import com.example.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.ui.ModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class LoginControllerTest {

    @Mock
    private LoginService mockService; // Mock the LoginService (avoid actual database calls)

    @Mock
    private HttpSession mockSession;

    @Mock
    private ModelMap mockModel;

    @InjectMocks
    private LoginController loginController; // Inject the mock service into the controller

    @BeforeEach
    void setUp() {
        // Initialize mocks
        mockService = mock(LoginService.class);
        mockSession = mock(HttpSession.class);
        mockModel = mock(ModelMap.class);
        loginController = new LoginController();
        loginController.service = mockService;  // Inject mock service into controller
    }

    @Test
    void testShowLoginPage() {
        // Call the method
        String viewName = loginController.showLoginPage(mockModel);

        // Assert that the correct view is returned
        assertEquals("login", viewName);
    }

    @Test
    void testShowWelcomePage_ValidUser() {
        // Given valid input
        String name = "Alex";
        String surname = "Xu";
        String driverID = "A12345";
        String phoneNumber = "1234567890";

        // Mock the service call to simulate a valid user (no database call)
        when(mockService.validateUser(name, surname, driverID, phoneNumber)).thenReturn(true);


        String viewName = loginController.showWelcomePage(mockSession, mockModel, name, surname, driverID, phoneNumber);

        verify(mockSession).setAttribute("driverID", driverID);

        assertEquals("redirect:/welcome", viewName);

        verify(mockModel).put("name", name);
        verify(mockModel).put("surname", surname);
        verify(mockModel).put("driverID", driverID);
        verify(mockModel).put("phone", phoneNumber);
    }

    @Test
    void testShowWelcomePage_InvalidUser() {
        String name = "Alex";
        String surname = "Xu";
        String driverID = "A12345";
        String phoneNumber = "1234567890";

        when(mockService.validateUser(name, surname, driverID, phoneNumber)).thenReturn(false);
        String viewName = loginController.showWelcomePage(mockSession, mockModel, name, surname, driverID, phoneNumber);
        assertEquals("login", viewName);
        verify(mockModel).put("errorMessage", "Access Denied: Invalid Driver Credentials. ");
    }

    @Test
    void testSessionPersistence_AfterLogin() {
        // Given valid credentials
        String name = "Alex";
        String surname = "Xu";
        String driverID = "A123456";
        String phoneNumber = "1234567890";

        when(mockService.validateUser(name, surname, driverID, phoneNumber)).thenReturn(true);
        loginController.showWelcomePage(mockSession, mockModel, name, surname, driverID, phoneNumber);
        verify(mockSession).setAttribute("driverID", driverID);
    }




}
