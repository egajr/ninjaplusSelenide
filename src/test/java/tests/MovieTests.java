package tests;

import common.BaseTest;
import models.MovieModel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.text;

public class MovieTests extends BaseTest {

    @BeforeMethod
    public void setup() {
        login
                .open()
                .with("egajr@ninjaplus.com", "242424");
        side.loggedUser().shouldHave(text("Eder Junior"));
    }

    @Test
    public void shouldRegisterANewMovie() {
        String title = "Jumanji - Próxima fase";
        String status = "Pré-venda";
        String year = "2020";
        String releaseDate = "16/01/2020";
        List<String> cast = Arrays.asList("The Rock", "Jack Black", "Kevin Hart", "Karen Gillan", "Danny DeVito");
        String plot = "Tentado a revisitar o mundo de Jumanji, Spencer decide" +
                "consertar o bug no jogo do game que permite que sejam transportados ao local";

        MovieModel movieData = new MovieModel(
                "Jumanji - Próxima fase",
                "Pré-venda",
                2020,
                "16/01/2020",
                Arrays.asList("The Rock", "Jack Black", "Kevin Hart", "Karen Gillan", "Danny DeVito"),
                "Tentado a revisitar o mundo de Jumanji, Spencer decide"
                       + " consertar o bug no jogo do game que permite que sejam transportados ao local"
        );

        movie.add().create(movieData);
    }
}
