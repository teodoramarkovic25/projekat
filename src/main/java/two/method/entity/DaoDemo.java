package two.method.entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoDemo {
    static final String URL = "jdbc:mysql://localhost:3306/sakila";
    static final String username = "root";
    static final String password = "root";


    public List<Movie> loadMovies() {
        List<Movie> movies = new ArrayList<>();
        //1.Connection
        try (Connection connection = DriverManager.getConnection(URL, username, password);) {
//2.statement
            Statement statement = connection.createStatement();
            //3. ResultSet
            ResultSet resultSet = statement.executeQuery("select * from film");
            while (resultSet.next()) {
                int movieId = resultSet.getInt(1);
                String movieTitle = resultSet.getString(2);
                String director = resultSet.getString(3);
                int year = resultSet.getInt("release_year");
                int genreId = resultSet.getInt(5);
                Movie movie = new Movie(movieId,movieTitle,director,year,genreId);
                movies.add(movie);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return movies;
    }


}
