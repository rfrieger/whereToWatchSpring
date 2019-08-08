package com.whereToWatch.WhereToWatch.secruity;

import com.whereToWatch.WhereToWatch.repos.UserRepo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class MyUserDetailsTest {

    @Mock
    private UserRepo mockUserRepository;

    @InjectMocks
    private MyUserDetails myUserDetailsUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testLoadUserByUsername() throws Exception {
        // Setup
        final String username = "username";
        final UserDetails expectedResult = null;
        when(mockUserRepository.findByUsername("username")).thenReturn(null);

        // Run the test
        final UserDetails result = myUserDetailsUnderTest.loadUserByUsername(username);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test(expected = UsernameNotFoundException.class)
    public void testLoadUserByUsername_ThrowsUsernameNotFoundException() throws Exception {
        // Setup
        final String username = "username";
        when(mockUserRepository.findByUsername("username")).thenReturn(null);

        // Run the test
        myUserDetailsUnderTest.loadUserByUsername(username);
    }
}
