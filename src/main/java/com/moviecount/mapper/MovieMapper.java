package com.moviecount.mapper;


import com.moviecount.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MovieMapper {

    List<Movie> sel(Integer year,Integer month,Integer day,Integer season,Integer weekday,String name,
                    String director,String actor,String genres,Double score,Integer above);

    List<String> selDirectors(String tconst);

    List<String> selActors(String tconst);

    List<String> selGenres(String tconst);

    Movie selTotal(String tconst);

    Integer selNum(String tconst);
}
