package com.moviecount.view;

import com.moviecount.entity.CoWorkRecord;
import com.moviecount.entity.Partner;

import java.util.List;

public class AllCooperationResult {
    private Integer errorCode;
    private List<Partner> data;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public List<Partner> getData() {
        return data;
    }

    public void setData(List<Partner> data) {
        this.data = data;
    }
}
