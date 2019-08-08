package com.whereToWatch.WhereToWatch.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocationRequestTest {

    private LocationRequest locationRequestUnderTest;

    @Before
    public void setUp() {
        locationRequestUnderTest = new LocationRequest(0, "name", "description", "city", "address", "team");
    }

    @Test
    public void getLocation_id() {
        Integer actual = locationRequestUnderTest.getLocation_id();
        Integer expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setLocation_id() {
        locationRequestUnderTest.setLocation_id(1);
        Integer actual =locationRequestUnderTest.getLocation_id();
        Integer expected = 1;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void getName() {
       String actual = locationRequestUnderTest.getName();
       String expected = "name";

       Assert.assertEquals(actual, expected);

    }

    @Test
    public void setName() {
        locationRequestUnderTest.setName("bob");

        String actual = locationRequestUnderTest.getName();
        String expected = "bob";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getDescription() {
        String actual = locationRequestUnderTest.getDescription();
        String expected = "description";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setDescription() {
        locationRequestUnderTest.setDescription("test");

        String actual = locationRequestUnderTest.getDescription();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getCity() {
        String actual = locationRequestUnderTest.getCity();
        String expected = "city";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setCity() {
        locationRequestUnderTest.setCity("test");

        String actual = locationRequestUnderTest.getCity();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAddress() {

        String actual = locationRequestUnderTest.getAddress();
        String expected = "address";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setAddress() {
        locationRequestUnderTest.setAddress("test");

        String actual = locationRequestUnderTest.getAddress();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }
}
