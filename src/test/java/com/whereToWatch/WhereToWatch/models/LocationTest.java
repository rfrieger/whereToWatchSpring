package com.whereToWatch.WhereToWatch.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocationTest {

    private Location locationUnderTest;

    @Before
    public void setUp() {
        locationUnderTest = new Location( "name", "description", "city", "address", "team");
    }

    @Test
    public void getLocation_id() {
        Integer actual = locationUnderTest.getLocation_id();
        Integer expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setLocation_id() {
        locationUnderTest.setLocation_id(1);
        Integer actual =locationUnderTest.getLocation_id();
        Integer expected = 1;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getName() {
        String actual = locationUnderTest.getName();
        String expected = "name";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void setName() {
        locationUnderTest.setName("bob");

        String actual = locationUnderTest.getName();
        String expected = "bob";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getDescription() {
        String actual = locationUnderTest.getDescription();
        String expected = "description";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setDescription() {
        locationUnderTest.setDescription("test");

        String actual = locationUnderTest.getDescription();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getCity() {
        String actual = locationUnderTest.getCity();
        String expected = "city";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setCity() {
        locationUnderTest.setCity("test");

        String actual = locationUnderTest.getCity();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAddress() {

        String actual = locationUnderTest.getAddress();
        String expected = "address";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setAddress() {
        locationUnderTest.setAddress("test");

        String actual = locationUnderTest.getAddress();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }
}
