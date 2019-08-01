package com.whereToWatch.WhereToWatch.models;

public class TeamRequest {

    private Integer team_id;
    private String name;

    public TeamRequest(Integer team_id, String name) {
        this.team_id = team_id;
        this.name = name;
    }

    public TeamRequest() {}


    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
