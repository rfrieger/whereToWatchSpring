package com.whereToWatch.WhereToWatch.controllers;

import com.whereToWatch.WhereToWatch.models.Location;
import com.whereToWatch.WhereToWatch.models.LocationRequest;
import com.whereToWatch.WhereToWatch.services.LocationService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class LocationControllerTest {

    @Mock
    private LocationService mockLocationService;

    @InjectMocks
    private LocationController locationControllerUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testFindByLocations() {
        // Setup
        final String city = "city";
        final Iterable<Location> expectedResult = null;
        when(mockLocationService.findAllLocationsByCity("city")).thenReturn(Arrays.asList());

        // Run the test
        final Iterable<Location> result = locationControllerUnderTest.findByLocations(city);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindByLocation() {
        // Setup
        final String city = "city";
        final Location expectedResult = null;
        when(mockLocationService.findLocationByCity("city")).thenReturn(null);

        // Run the test
        final Location result = locationControllerUnderTest.findByLocation(city);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindLocationByCityAndTeam() {
        // Setup
        final String city = "city";
        final String team = "team";
        final Iterable<Location> expectedResult = null;
        when(mockLocationService.findLocationByCityAndTeam("city", "team")).thenReturn(null);

        // Run the test
        final Iterable<Location> result = locationControllerUnderTest.findLocationByCityAndTeam(city, team);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindLocationsbyTeam() {
        // Setup
        final String team = "team";
        final Iterable<Location> expectedResult = null;
        when(mockLocationService.findLocationsbyTeam("team")).thenReturn(null);

        // Run the test
        final Iterable<Location> result = locationControllerUnderTest.findLocationsbyTeam(team);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAddLocation() {
        // Setup
        final LocationRequest locationRequest = null;
        final String teamName = "teamName";
        final Location expectedResult = null;
        when(mockLocationService.addLocation(null, "teamName")).thenReturn(null);

        // Run the test
        final Location result = locationControllerUnderTest.addLocation(locationRequest, teamName);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
