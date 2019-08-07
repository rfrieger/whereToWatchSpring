package com.whereToWatch.WhereToWatch.controllers;

import com.whereToWatch.WhereToWatch.models.Team;
import com.whereToWatch.WhereToWatch.models.TeamRequest;
import com.whereToWatch.WhereToWatch.services.TeamService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TeamControllerTest {

    private TeamController teamControllerUnderTest;

    @Before
    public void setUp() {
        teamControllerUnderTest = new TeamController();
        teamControllerUnderTest.teamService = mock(TeamService.class);
    }

    @Test
    public void testFindByLocation() {
        // Setup
        final String name = "name";
        final Team expectedResult = null;
        when(teamControllerUnderTest.teamService.findTeamByName("name")).thenReturn(null);

        // Run the test
        final Team result = teamControllerUnderTest.findByLocation(name);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAddTeam() {
        // Setup
        final TeamRequest teamRequest = null;
        final Team expectedResult = null;
        when(teamControllerUnderTest.teamService.addTeam(null)).thenReturn(null);

        // Run the test
        final Team result = teamControllerUnderTest.addTeam(teamRequest);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
