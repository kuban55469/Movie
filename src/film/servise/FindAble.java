package film.servise;

import film.movie.Cast;
import film.movie.Movie;

import java.util.List;

public interface FindAble {
    List<Movie>getAllMovies(List<Movie>movies);
    void findMovieByName(String name, List<Movie>movies);
    void findMovieByActorName(String name, List<Movie>movies);
    void findMovieByYear(int year, List<Movie>movies);
    void findMovieByDirector(String directorName,List<Movie>movies);
    void findMovieByDescription(String descriptionName,List<Movie> movies);
    void findMovieByRole(String roleName,List<Movie>movies);
    void findByActorName(String name, List<Movie> movies);
}
