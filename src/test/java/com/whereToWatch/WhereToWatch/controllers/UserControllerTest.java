package com.whereToWatch.WhereToWatch.controllers;

import com.whereToWatch.WhereToWatch.dto.UserData;
import com.whereToWatch.WhereToWatch.dto.UserResponse;
import com.whereToWatch.WhereToWatch.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserControllerTest {

    @Mock
    private ModelMapper mockModelMapper;
    @Mock
    private UserService mockUserService;

    private UserController userControllerUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
        userControllerUnderTest = new UserController(mockModelMapper, mockUserService);
    }

    @Test
    public void testLogin() {
        // Setup
        final String username = "username";
        final String password = "password";
        final String expectedResult = "result";
        when(mockUserService.signin("username", "password")).thenReturn("result");

        // Run the test
        final String result = userControllerUnderTest.login(username, password);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSignup() {
        // Setup
        final UserData user = null;
        final String expectedResult = "result";
        when(mockUserService.signup(null)).thenReturn("result");
        when(mockModelMapper.map(null, null)).thenReturn(null);

        // Run the test
        final String result = userControllerUnderTest.signup(user);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testWhoami() {
        // Setup
        final HttpServletRequest req = null;
        final UserResponse expectedResult = null;
        when(mockModelMapper.map(null, null)).thenReturn(null);
        when(mockUserService.whoami(null)).thenReturn(null);

        // Run the test
        final UserResponse result = userControllerUnderTest.whoami(req);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
