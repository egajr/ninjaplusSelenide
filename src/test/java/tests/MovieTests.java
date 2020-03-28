package tests;

import common.BaseTest;
import libs.Database;
import models.MovieModel;
import org.testng.annotations.*;

import java.util.Arrays;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class MovieTests extends BaseTest {
    private Database db;

    @BeforeMethod
    public void setup() {
        login
                .open()
                .with("egajr@ninjaplus.com", "242424");
        side.loggedUser().shouldHave(text("Eder Junior"));
    }

    @BeforeSuite
    public void uniqueTime(){
        db = new Database();
        db.resetMovies();
    }

    @Test
    public void shouldRegisterANewMovie() {
        MovieModel movieData = new MovieModel(
                "Jumanji - Próxima fase",
                "Pré-venda",
                2020,
                "16/01/2020",
                Arrays.asList("The Rock", "Jack Black", "Kevin Hart", "Karen Gillan", "Danny DeVito"),
                "Tentado a revisitar o mundo de Jumanji, Spencer decide"
                        + " consertar o bug no jogo do game que permite que sejam transportados ao local",
                "jumanji2.jpg"
        );

        //db.deleteMovie(movieData.title);

        movie
                .add()
                .create(movieData)
                .items().findBy(text(movieData.title)).shouldBe(visible);
    }

    @Test
    public void shouldSearchOneMovies(){
        //db.insertMovies();
        movie.search("Star Wars").items().shouldHaveSize(1);
    }

    @Test
    public void shouldSearchTwoMovies(){
        //db.insertMovies();
        movie.search("Bad Boys").items().shouldHaveSize(2);
    }

    @AfterMethod
    public void cleanUp() {
        login.clearSession();
    }
}
