package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Team;
import com.whereToWatch.WhereToWatch.models.TeamRequest;
import com.whereToWatch.WhereToWatch.repos.TeamRepo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class TeamServiceTest {

    @Mock
    private TeamRepo mockTeamRepo;

    @InjectMocks
    private TeamService teamServiceUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testFindTeamByName() {
        // Setup
        final String name = "name";
        final Team expectedResult = null;
        when(mockTeamRepo.findTeamByName("team")).thenReturn(null);

        // Run the test
        final Team result = teamServiceUnderTest.findTeamByName(name);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAddTeam() {
        // Setup
        final TeamRequest teamRequest = null;
        final Team expectedResult = null;
        when(mockTeamRepo.save(null)).thenReturn(null);

        // Run the test
        final Team result = teamServiceUnderTest.addTeam(teamRequest);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
