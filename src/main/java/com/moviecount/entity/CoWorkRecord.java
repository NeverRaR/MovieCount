package com.moviecount.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoWorkRecord {
    private Integer birthYear;
    private Integer cooTime;
    private Integer deathYear;
    private String name;
    private String nconst;

    @JsonProperty("birth_year")
    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    @JsonProperty("coo_time")
    public Integer getCooTime() {
        return cooTime;
    }

    public void setCooTime(Integer cooTime) {
        this.cooTime = cooTime;
    }

    @JsonProperty("death_year")
    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNconst() {
        return nconst;
    }

    public void setNconst(String nconst) {
        this.nconst = nconst;
    }
}
