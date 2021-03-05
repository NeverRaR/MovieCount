package com.moviecount.service;

import com.moviecount.entity.Partner;
import com.moviecount.mapper.CoWorkMapper;
import com.moviecount.entity.CoWorkRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoWorkService {
    @Autowired
    CoWorkMapper coWorkMapper;

    public List<CoWorkRecord> selCoWork(String nconst,Integer as_role,Integer cooper){
        return coWorkMapper.selCoWork(nconst, as_role, cooper);
    }

    public List<Partner> selAllCoWork(Integer style){
        return coWorkMapper.selAllCoWork(style);
    }
}
