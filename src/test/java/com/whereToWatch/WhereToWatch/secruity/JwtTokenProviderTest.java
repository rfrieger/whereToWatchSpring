package com.whereToWatch.WhereToWatch.secruity;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class JwtTokenProviderTest {

    @Mock
    private MyUserDetails mockUserDetails;

    @InjectMocks
    private JwtTokenProvider jwtTokenProviderUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testCreateToken() {
        // Setup
        final String username = "username";
        final String expectedResult = "result";

        // Run the test
        final String result = jwtTokenProviderUnderTest.createToken(username);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetAuthentication() throws Exception {
        // Setup
        final String token = "token";
        final Authentication expectedResult = null;
        when(mockUserDetails.loadUserByUsername("username")).thenReturn(null);

        // Run the test
        final Authentication result = jwtTokenProviderUnderTest.getAuthentication(token);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetAuthentication_MyUserDetailsThrowsUsernameNotFoundException() throws Exception {
        // Setup
        final String token = "token";
        final Authentication expectedResult = null;
        when(mockUserDetails.loadUserByUsername("username")).thenThrow(UsernameNotFoundException.class);

        // Run the test
        final Authentication result = jwtTokenProviderUnderTest.getAuthentication(token);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetUsername() {
        // Setup
        final String token = "token";
        final String expectedResult = "result";

        // Run the test
        final String result = jwtTokenProviderUnderTest.getUsername(token);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testResolveToken() {
        // Setup
        final HttpServletRequest req = null;
        final String expectedResult = "result";

        // Run the test
        final String result = jwtTokenProviderUnderTest.resolveToken(req);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testValidateToken() {
        // Setup
        final String token = "token";

        // Run the test
        final boolean result = jwtTokenProviderUnderTest.validateToken(token);

        // Verify the results
        assertTrue(result);
    }
}
