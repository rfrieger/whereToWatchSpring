package com.whereToWatch.WhereToWatch.secruity;

import org.junit.Before;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

public class JwtTokenFilterTest {

    @Mock
    private JwtTokenProvider mockJwtTokenProvider;

    private JwtTokenFilter jwtTokenFilterUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
        jwtTokenFilterUnderTest = new JwtTokenFilter(mockJwtTokenProvider);
    }
}
