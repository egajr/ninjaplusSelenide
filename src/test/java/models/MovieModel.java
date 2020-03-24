package models;

import java.util.List;

public class MovieModel {
    public String title;
    public String status;
    public Integer year;
    public String releaseDate;
    public List<String> cast;
    public String plot;

    public MovieModel(String title, String status, Integer year, String releaseDate, List<String> cast, String plot){
        this.title = title;
        this.status = status;
        this.year = year;
        this.releaseDate = releaseDate;
        this.cast = cast;
        this.plot = plot;
    }
}
