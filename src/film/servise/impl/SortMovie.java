package film.servise.impl;

import film.movie.Movie;
import film.servise.SortAble;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMovie implements SortAble {

    public SortMovie() {
    }


    @Override
    public void sortByMovieNameA_z(List<Movie> movies) {
        movies.sort(sortByMovieName1);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYearAscending(List<Movie> movies) {
        movies.sort(sortByYear1);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByMovieNameZ_a(List<Movie> movies) {
        movies.sort(sortByMovieNameZ_a);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYearDescending(List<Movie> movies) {
        movies.sort(sortByYear1Descending);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(sortByDirectorr);
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
    public static Comparator<Movie> sortByMovieName1 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> sortByYear1 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };



    public static Comparator<Movie> sortByMovieNameZ_a = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator<Movie> sortByYear1Descending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear() - o1.getYear();
        }
    };
    public static Comparator<Movie> sortByDirectorr = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };

}
