package ua.model.entity;

import java.util.Objects;

public class Booklet extends PublicationEntity {
    private int popularity;

    public Booklet() {

    }

    public Booklet(String genre, String author, String title, int amountOfPages, int popularity, String qualityOfPaper) {
        super(genre,author,title,amountOfPages, popularity, qualityOfPaper);
        this.popularity = popularity;

    }


    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Booklet : " + super.toString() +
                ", QualityOfPaper = " + getQualityOfPaper() +
                '\n';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Booklet that = (Booklet) o;
//        return Objects.equals(qualityOfPaper, that.qualityOfPaper);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(super.hashCode(), qualityOfPaper);
//    }
//
//
//    public int compareTo(Booklet o) {
//        return o.getAmountOfPages() - this.getAmountOfPages();
//    }



}
