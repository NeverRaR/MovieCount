package com.moviecount.view;

import com.moviecount.entity.CoWorkRecord;

import java.util.List;

public class CoWorkResult {
    private Integer errorCode;
    private List<CoWorkRecord> data;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public List<CoWorkRecord> getData() {
        return data;
    }

    public void setData(List<CoWorkRecord> data) {
        this.data = data;
    }
}
