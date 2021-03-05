package com.moviecount.view;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieTag {
    private String dataDt;
    private Integer year;
    private String tconst;
    private String primaryTitle;

    @JsonProperty("data_dt")
    public String getDataDt() {
        return dataDt;
    }

    public void setDataDt(String dataDt) {
        this.dataDt = dataDt;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTconst() {
        return tconst;
    }

    @JsonProperty("primary_title")
    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }
}
