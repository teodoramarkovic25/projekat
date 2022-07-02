package two.method.entity;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
1. Connection connection = DriverMenager
povezati se na izvor podataka
1.1 instalirati driver ili lib mysql
1.2. imati prava pristupa bazi
2. Statement statement = connection.create
slati upite i tražiti podatke
3. ResultSet resultSet = statement.executeQuery();
procesirati i obraditi rezultat upita ili dobijene podatke obraditi

 */
public class MovieDao {
    static final String URL = "";
    static final String username = "root";
    static final String password = "root";
    MysqlDataSource dataSource = new MysqlDataSource();

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDao();
        movieDao.queryMovies();
    }

    public List<Movie> queryMovies (){

        List<Movie> movies = new ArrayList<>();
//Connection
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        try(Connection connection = dataSource.getConnection("root","root")){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM film");
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String description = resultSet.getString(3);
                System.out.println(id + " " + name + " " + description);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return  movies;
    }
}
