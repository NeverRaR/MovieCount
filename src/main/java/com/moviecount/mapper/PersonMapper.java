package com.moviecount.mapper;

import com.moviecount.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PersonMapper {

    Person selActorById(String nconst);

    Person selDirectorById(String nconst);

    List<String> selActorNconstByPage(@Param("offset")Integer page_id);

    List<String> selDirectorNconstByPage(@Param("offset")Integer offset);

    List<Person> selActorByName(String name);

    List<Person> selDirectorByName(String name);
}
