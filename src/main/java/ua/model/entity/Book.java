package ua.model.entity;

public class Book extends PublicationEntity {
    private String cover;
    private String link;


    public Book(String genre, String author, String title, int amountOfPages, int popularity, String qualityOfPaper, String cover) {
        super(genre,author,title,amountOfPages, popularity, qualityOfPaper);
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book :    " + super.toString() +
                ", Cover is " + getCover() + '\n';
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Book that = (Book) o;
//
//        if (cover != null ? !cover.equals(that.cover) : that.cover != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return cover != null ? cover.hashCode() : 0;
//    }
//
//    @Override
//    public int compareTo(Book o) {
//        return o.getAmountOfPages() - this.getAmountOfPages();
//    }


}
