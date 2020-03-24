package pages;

import com.codeborne.selenide.SelenideElement;
import models.MovieModel;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static  com.codeborne.selenide.Condition.text;

public class MoviePage {

    public MoviePage add() {
        $(".movie-add").click();
        return this;
    }

    public MoviePage create(MovieModel movie) {
        $("input[name=title]").setValue(movie.title);
        this.selectedStatus(movie.status);
        $("input[name=year]").setValue(movie.year.toString());
        $("input[name=release_date]").setValue(movie.releaseDate);
        this.inputCast(movie.cast);
        $("textarea[name=overview]").setValue(movie.plot);
        return this;
    }

    private void inputCast(List<String> cast){
        SelenideElement element = $(".cast");

        for(String actor : cast) {
            element.setValue(actor);
            element.sendKeys(Keys.TAB);
        }
    }

    private void selectedStatus(String status) {
        $("input[placeholder=Status]").click();
        $$("ul li span").findBy(text(status)).click();
    }
}
