package com.moviecount.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Partner {

    private Integer cooTime;
    private Integer birthYear1;
    private Integer deathYear1;
    private String name1;
    private String nconst1;
    private Integer birthYear2;
    private Integer deathYear2;
    private String name2;
    private String nconst2;

    @JsonProperty("coo_time")
    public Integer getCooTime() {
        return cooTime;
    }

    public void setCooTime(Integer cooTime) {
        this.cooTime = cooTime;
    }

    @JsonProperty("birth_year1")
    public Integer getBirthYear1() {
        return birthYear1;
    }

    public void setBirthYear1(Integer birthYear1) {
        this.birthYear1 = birthYear1;
    }

    @JsonProperty("death_year1")
    public Integer getDeathYear1() {
        return deathYear1;
    }

    public void setDeathYear1(Integer deathYear1) {
        this.deathYear1 = deathYear1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getNconst1() {
        return nconst1;
    }

    public void setNconst1(String nconst1) {
        this.nconst1 = nconst1;
    }

    @JsonProperty("birth_year2")
    public Integer getBirthYear2() {
        return birthYear2;
    }

    public void setBirthYear2(Integer birthYear2) {
        this.birthYear2 = birthYear2;
    }

    @JsonProperty("death_year2")
    public Integer getDeathYear2() {
        return deathYear2;
    }

    public void setDeathYear2(Integer deathYear2) {
        this.deathYear2 = deathYear2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getNconst2() {
        return nconst2;
    }

    public void setNconst2(String nconst2) {
        this.nconst2 = nconst2;
    }
}
