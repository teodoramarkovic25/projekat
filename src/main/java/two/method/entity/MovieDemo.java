package two.method.entity;

import java.util.*;
import java.util.function.Consumer;
/*

Lambda može kreirati umjesto opetratora new objekat tipa funkcionalnog interfejsa
Lambda definiše blok koda apstraktne metode
ja to mogu jer funkcionalni interfejs  ima samo jednu apstraktnu metodu
kada lambda ne radi ništa druge već poziva metodu onda nek se referencira :
TIPOVI REFERENCIRANJA:
1. referenciranje na statičku metodu



 */
public class MovieDemo {
    public static void main(String[] args) {
        DaoDemo daoDemo = new DaoDemo();
        List<Movie> movies = daoDemo.loadMovies();
        MovieComparator movieComparator = new MovieComparator();
       // Comparator<Movie> movieYearComparator = (m1,m2)-> movieComparator.compareByYear(m1,m2);
        // Comparator<Movie> movieYearComparator = movieComparator::compareByYear;
        //Collections.sort(movies,movieYearComparator);
        //movies.stream().forEach(MovieDemo::printMovie);
        movies.stream().map(Movie::getYear).forEach(System.out::println);
        //Java Enhanced for loop Iterator<Movie>
        //for(Movie movie : movies){
        //System.out.println(movie);

        //C++ style
       /* for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            printMovie(movie);

        */
        // Java .forEach (od jave 8) 1. izvor stream 2. međuoperacije 3.terminirajuće operacije
       // Consumer<Movie> movieConsumer = MovieDemo::printMovie;
               // movies.stream().forEach(m -> printMovie(m));

    }

    private static void printMovie(Movie movie) {
        System.out.println(movie);

    }
}
