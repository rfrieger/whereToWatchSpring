package com.whereToWatch.WhereToWatch.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeamTest {

    private Team teamUnderTest;

    @Before
    public void setUp() {
        teamUnderTest = new Team(0, "name");

    }

    @Test
    public void getTeam_id() {

        Integer actual = teamUnderTest.getTeam_id();
        Integer expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setTeam_id() {
        teamUnderTest.setTeam_id(1);

        Integer actual = teamUnderTest.getTeam_id();
        Integer expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getName() {

        String actual = teamUnderTest.getName();
        String expected = "name";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setName() {
        teamUnderTest.setName("test");

        String actual = teamUnderTest.getName();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }
}
