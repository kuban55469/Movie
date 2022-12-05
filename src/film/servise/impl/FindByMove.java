package film.servise.impl;

import film.movie.Cast;
import film.movie.Movie;
import film.servise.FindAble;
import film.servise.exception.MyException;

import java.util.List;
import java.util.Scanner;

public class FindByMove implements FindAble {

    public FindByMove() {
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(String name, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                System.out.println(movie);
            }

        }
    }

    @Override
    public void findMovieByActorName(String acterName, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getCast().getActerFullName().equals(acterName)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByYear(int year, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getYear() == year) {
                System.out.println("Year: " + movie.getYear() + "\n" + movie);
            }
        }
    }

    @Override
    public void findMovieByDirector(String directorName, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getDirector().getName().equals(directorName)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDescription(String descriptionName, List<Movie> movies) {
        try {
            for (Movie movie : movies) {
                if (movie.getDescription().equals(descriptionName)) {
                    System.out.println(movie);
                }
                throw new Exception("Ne Nauideno!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findMovieByRole(String roleName, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getCast().getRole().equals(roleName)) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findByActorName(String name, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.getCast().getActerFullName().equals(name)) {
                System.out.println("Actor: " + movie.getCast().getActerFullName() + "\nRole: " + movie.getCast().getRole());
            }
        }
    }
}
