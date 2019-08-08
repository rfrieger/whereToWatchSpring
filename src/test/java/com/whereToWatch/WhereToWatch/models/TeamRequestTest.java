package com.whereToWatch.WhereToWatch.models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeamRequestTest {
        TeamRequest teamRequest = new TeamRequest(0, "name");

    @Test
    public void getTeam_id() {

        Integer actual = teamRequest.getTeam_id();
        Integer expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setTeam_id() {
        teamRequest.setTeam_id(1);

        Integer actual = teamRequest.getTeam_id();
        Integer expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getName() {

        String actual = teamRequest.getName();
        String expected = "name";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setName() {
        teamRequest.setName("test");

        String actual = teamRequest.getName();
        String expected = "test";

        Assert.assertEquals(actual, expected);
    }
}