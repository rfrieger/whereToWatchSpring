package com.whereToWatch.WhereToWatch.secruity;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class WebSecurityConfigTest {

    @Mock
    private JwtTokenProvider mockJwtTokenProvider;

    @InjectMocks
    private WebSecurityConfig webSecurityConfigUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testPasswordEncoder() {
        // Setup
        final PasswordEncoder expectedResult = null;

        // Run the test
        final PasswordEncoder result = webSecurityConfigUnderTest.passwordEncoder();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAuthenticationManagerBean() throws Exception {
        // Setup
        final AuthenticationManager expectedResult = null;

        // Run the test
        final AuthenticationManager result = webSecurityConfigUnderTest.authenticationManagerBean();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test(expected = Exception.class)
    public void testAuthenticationManagerBean_ThrowsException() throws Exception {
        // Setup

        // Run the test
        webSecurityConfigUnderTest.authenticationManagerBean();
    }
}
