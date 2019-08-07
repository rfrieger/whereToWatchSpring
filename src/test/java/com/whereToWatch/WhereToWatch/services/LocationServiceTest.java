package com.whereToWatch.WhereToWatch.services;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.models.LocationRequest;
import com.whereToWatch.WhereToWatch.repos.LocationRepo;
import com.whereToWatch.WhereToWatch.repos.TeamRepo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class LocationServiceTest {

    @Mock
    private LocationRepo mockLocationRepo;
    @Mock
    private TeamRepo mockTeamRepo;

    @InjectMocks
    private LocationService locationServiceUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testFindLocationByCityAndTeam() {
        // Setup
        final String city = "city";
        final String team = "team";
        final Iterable<Location> expectedResult = null;
        when(mockLocationRepo.findLocationsByCity("city")).thenReturn(Arrays.asList());

        // Run the test
        final Iterable<Location> result = locationServiceUnderTest.findLocationByCityAndTeam(city, team);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindAllLocationsByCity() {
        // Setup
        final String city = "city";
        final List<Location> expectedResult = Arrays.asList();
        when(mockLocationRepo.findLocationsByCity("city")).thenReturn(Arrays.asList());

        // Run the test
        final List<Location> result = locationServiceUnderTest.findAllLocationsByCity(city);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAddLocation() {
        // Setup
        final LocationRequest locationRequest = null;
        final String teamName = "teamName";
        final Location expectedResult = null;
        when(mockTeamRepo.findTeamByName("team")).thenReturn(null);
        when(mockLocationRepo.save(null)).thenReturn(null);

        // Run the test
        final Location result = locationServiceUnderTest.addLocation(locationRequest, teamName);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindLocationByCity() {
        // Setup
        final String city = "city";
        final Location expectedResult = null;
        when(mockLocationRepo.findLocationByCity("city")).thenReturn(null);

        // Run the test
        final Location result = locationServiceUnderTest.findLocationByCity(city);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindLocationsbyTeam() {
        // Setup
        final String team = "team";
        final Iterable<Location> expectedResult = null;
        when(mockTeamRepo.findTeamByName("team")).thenReturn(null);

        // Run the test
        final Iterable<Location> result = locationServiceUnderTest.findLocationsbyTeam(team);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
