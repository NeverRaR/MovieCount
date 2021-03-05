package com.moviecount.service;

import com.moviecount.entity.Person;
import com.moviecount.mapper.PersonMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Person selActorById(String nconst){
        return personMapper.selActorById(nconst);
    }

    public Person selDirectorById(String nconst){
        return personMapper.selDirectorById(nconst);
    }

    public List<String> selActorNconstByPage(Integer page_id){
        return personMapper.selActorNconstByPage((page_id-1)*100);
    }

    public List<String> selDirectorNconstByPage(Integer page_id){
        return personMapper.selDirectorNconstByPage((page_id-1)*100);
    }

    public List<Person> selActorByName(String name){
        return personMapper.selActorByName(name);
    }

    public List<Person> selDirectorByName(String name){
        return personMapper.selDirectorByName(name);
    }


}
