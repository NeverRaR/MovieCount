package com.moviecount.view;

import java.util.List;

public class MovieCountResult {
    private Integer errorCode;
    private Integer count;
    private List<MovieTag> data;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<MovieTag> getData() {
        return data;
    }

    public void setData(List<MovieTag> data) {
        this.data = data;
    }
}
