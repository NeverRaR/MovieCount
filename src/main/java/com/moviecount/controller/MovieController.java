package com.moviecount.controller;

import com.moviecount.entity.Movie;
import com.moviecount.service.MovieService;
import com.moviecount.view.MovieCountResult;
import com.moviecount.view.MovieDetail;
import com.moviecount.view.MovieTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(path="api/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/getMovie")
    public @ResponseBody
    MovieCountResult getMovie (@RequestParam(required = false) Integer year,@RequestParam(required = false) Integer month,
                               @RequestParam(required = false) Integer day, @RequestParam(required = false) Integer season,
                               @RequestParam(required = false) Integer weekday,@RequestParam(required = false) String name,
                               @RequestParam(required = false) String director, @RequestParam(required = false) String actor,
                               @RequestParam(required = false) String genres, @RequestParam(required = false) Double score,
                               @RequestParam(required = false) Integer above, @RequestParam(required = false) Integer page_id) {
        List<Movie> movieList=movieService.sel(year, month, day, season, weekday, name, director, actor, genres, score, above);
        List<MovieTag> movieTagList=new LinkedList<MovieTag>();

        for(Movie movie : movieList){
            if(movie.getYear() == null || movie.getYear()> 2012) continue;
            MovieTag movieTag= new MovieTag();
            movieTag.setTconst(movie.getTconst());
            movieTag.setDataDt(movie.getDataDt());
            movieTag.setPrimaryTitle(movie.getPrimaryTitle());
            movieTag.setYear(movie.getYear());
            movieTagList.add(movieTag);
        }

        MovieCountResult movieCountResult = new MovieCountResult();
        movieCountResult.setErrorCode(0);
        movieCountResult.setCount(movieTagList.size());
        movieCountResult.setData(movieTagList);

        return movieCountResult;

    }

    @GetMapping("/getMovie/{tconst}")
    public @ResponseBody MovieDetail getMovieDetail(@PathVariable String tconst){
        MovieDetail movieDetail=new MovieDetail();
        Movie movie = movieService.selTotal(tconst);
        List<String> directors = movieService.selDirectors(tconst);
        List<String> actors = movieService.selActors(tconst);
        List<String> genres= movieService.selGenres(tconst);
        movieDetail.setMovie(movie);
        movieDetail.setDirectors(directors);
        movieDetail.setActors(actors);
        movieDetail.setGenres(genres);

        return movieDetail;
    }

    @GetMapping("/count/{tconst}")
    public @ResponseBody Integer getMovieCount(@PathVariable String tconst){
        Integer num =movieService.selNum(tconst);

        return num;
    }
}
