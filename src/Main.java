import film.movie.Cast;
import film.movie.Director;
import film.movie.Movie;
import film.servise.impl.FindByMove;
import film.servise.impl.SortMovie;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Практикалык тапшырма:
         * Movie:
         * private String name;
         * private int year;
         * private String description;
         * private Director director;
         * private List<Cast> cast;
         * Cast:
         * private String actorFullName;
         * private String role;
         * Director:
         * private String name;
         * private String lastName;
         * Findable:
         * List<Movie>getAllMovies(List<Movie>movies);
         * void findMovieByName(List<Movie>movies);
         * void findMovieByActorName(List<Movie>movies);
         * void findMovieByYear(List<Movie>movies);
         * void findMovieByDirector(List<Movie>movies);
         * void findMovieByDescription(List<Movie>movies);
         * void findMovieByRole(List<Movie>movies);
         * Sortable:
         * void sortByMovieName(List<Movie>movies);
         * -from A to Z
         * -from Z to A
         * void sortByYear(List<Movie>movies);
         * -Ascending
         * -Descending
         * void sortByDirector(List<Movie>movies);
         * ****** Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
         *            Бардык маалыматтар туура жана так болуп консольго чыксын.
         */


        Cast cast1 = new Cast("Tom Cruise", "Ethan Hunt");
        Cast cast2 = new Cast("Brad Pitt", "Tyler Durden");
        Cast cast3 = new Cast("Leonardo DiCaprio", "Jack Dawson");
        Cast cast4 = new Cast("Ryan Gosling", "Sebastian Wilder");
        Cast cast5 = new Cast("Ryan Reynolds", "Wade Wilson");
        Cast cast6 = new Cast("Jenna Ortega", "Wednesday Addams");
        Cast cast7 = new Cast("Kit Harrington", "Jon Snow");


//        List<Cast> casts1 = new ArrayList<>(List.of(cast1));
//        List<Cast> casts2 = new ArrayList<>(List.of(cast2));
//        List<Cast> casts3 = new ArrayList<>(List.of(cast3));
//        List<Cast> casts4 = new ArrayList<>(List.of(cast4));
//        List<Cast> casts5 = new ArrayList<>(List.of(cast5));

        List<Cast> casts = new ArrayList<>(Arrays.asList(
                cast1, cast2, cast3, cast4, cast5, cast6
        ));


        Director director1 = new Director("Brian De Palma");
        Director director2 = new Director("David Fincher");
        Director director3 = new Director("James Cameron");
        Director director4 = new Director("Tim Miller");
        Director director5 = new Director("Damien Chazelle");
        Director director6 = new Director("Tim Burton");
        Director director7 = new Director("David Benioff");


        Movie movie1 = new Movie("Mission Impossible", 1996, "Movie", director1, cast1);
        Movie movie2 = new Movie("Fight club", 1999, "Movie", director2, cast2);
        Movie movie3 = new Movie("Titanic", 1997, "Movie", director3, cast3);
        Movie movie4 = new Movie("La-La-Lend", 2016, "Movie", director4, cast4);
        Movie movie5 = new Movie("Deadpool", 2016, "Movie", director5, cast5);
        Movie movie6 = new Movie("Wednesday", 2022, "TV series", director6, cast6);
        Movie movie7 = new Movie("Game of Thrones", 2012, "TV series", director7, cast7);

        List<Movie> movies = new ArrayList<>(Arrays.asList(
                movie1, movie2, movie3, movie4, movie5, movie6, movie7
        ));

        FindByMove findByMove = new FindByMove();
        SortMovie sortMovie = new SortMovie();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        while (true) {
            System.out.println(
                    """
                            =======================COMMANDS=====================
                            Press 1 to print catalog
                            Press 2 to find a movie by full or name
                            Press 3 to sort by year
                            Press 4 to sort by name
                            Press 5 to sort by director
                            Press 6 to find movies by actor's name
                            Press 7 to find movies by director's name
                            Press 8 to find movies by year
                            Press 9 to list all movies and roles by actor's name
                            Press 10 to sort list of all actor's with his roles
                            ====================================================
                            """
            );
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~ALL MOVIES~~~~~~~~~~~~~~~");
                    findByMove.getAllMovies(movies).forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Write movies name: ");
                    findByMove.findMovieByName(scanner1.nextLine(), movies);
                    break;
                case 3:
                    System.out.println("""
                            Press 1 to sort by ascending
                            Press 2 to sort by descending
                            """);
                    switch (scanner.nextInt()) {
                        case 1 -> sortMovie.sortByYearAscending(movies);
                        case 2 -> sortMovie.sortByYearDescending(movies);
                        default -> System.out.println("Error press!!");
                    }
                    break;
                case 4:
                    System.out.println("""
                            Press 1 to sort by A-z
                            Press 1 to sort by Z-a
                            """);
                    switch (scanner.nextInt()) {
                        case 1 -> sortMovie.sortByMovieNameA_z(movies);
                        case 2 -> sortMovie.sortByMovieNameZ_a(movies);
                        default -> System.out.println("Error write!!");
                    }
                case 5:
                    sortMovie.sortByDirector(movies);
                    break;
                case 6:
                    System.out.println("Write actor's name: ");
                    findByMove.findMovieByActorName(scanner1.nextLine(), movies);
                    break;
                case 7:
                    System.out.println("Write director's name: ");
                    findByMove.findMovieByDirector(scanner1.nextLine(), movies);
                    break;
                case 8:
                    System.out.println("Write the year: ");
                    findByMove.findMovieByYear(scanner1.nextInt(), movies);
                    break;
                case 9:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Write actor's name: ");
                    String actName = scanner2.nextLine();
                    System.out.println("------------------------------------");
                    System.out.println("           Actor: " + actName);
                    System.out.println("------------------------------------");
                    findByMove.findByActorName(actName, movies);
                    break;
                case 10:
                    System.out.println("Write actor's role: ");
                    findByMove.findMovieByRole(scanner1.nextLine(), movies);
                    break;
                default:
                    System.out.println("Error writhing!!");
            }
        }
    }
}