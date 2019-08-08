package com.whereToWatch.WhereToWatch.secruity;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import static org.mockito.MockitoAnnotations.initMocks;

public class JwtTokenFilterConfigurerTest {

    @Mock
    private JwtTokenProvider mockJwtTokenProvider;

    private JwtTokenFilterConfigurer jwtTokenFilterConfigurerUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
        jwtTokenFilterConfigurerUnderTest = new JwtTokenFilterConfigurer(mockJwtTokenProvider);
    }

    @Test
    public void testConfigure() throws Exception {
        // Setup
        final HttpSecurity http = null;

        // Run the test
        jwtTokenFilterConfigurerUnderTest.configure(http);

        // Verify the results
    }

    @Test(expected = Exception.class)
    public void testConfigure_ThrowsException() throws Exception {
        // Setup
        final HttpSecurity http = null;

        // Run the test
        jwtTokenFilterConfigurerUnderTest.configure(http);
    }
}
