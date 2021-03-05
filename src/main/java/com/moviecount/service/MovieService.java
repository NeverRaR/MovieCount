package com.moviecount.service;


import com.moviecount.entity.Movie;
import com.moviecount.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieMapper movieMapper;

    public List<Movie> sel(Integer year,Integer month,Integer day,Integer season,Integer weekday,String name,
                           String director,String actor,String genres,Double score,Integer above){
        return movieMapper.sel(year,month,day,season,weekday,name,director,actor,genres,score,above);
    }

    public List<String> selDirectors(String tconst){
        return movieMapper.selDirectors(tconst);
    }

    public List<String> selActors(String tconst){
        return movieMapper.selActors(tconst);
    }

    public List<String> selGenres(String tconst){
        return movieMapper.selGenres(tconst);
    }

    public Movie selTotal(String tconst){
        return movieMapper.selTotal(tconst);
    }

    public Integer selNum(String tconst){
        return movieMapper.selNum(tconst);
    }
}
