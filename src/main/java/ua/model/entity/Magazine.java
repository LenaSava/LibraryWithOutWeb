package ua.model.entity;

public class Magazine extends PublicationEntity {
    private boolean withHotNews;

//    public Magazine() {
//
//    }

    public Magazine(String genre, String author, String title, int amountOfPages, int popularity, String qualityOfPaper, boolean withHotNews) {
        super(genre,author,title,amountOfPages, popularity, qualityOfPaper);
        this.withHotNews = withHotNews;
    }

    public boolean isWithHotNews() {
        return withHotNews;
    }

    public void setWithHotNews(boolean withHotNews) {
        this.withHotNews = withHotNews;
    }

    @Override
    public String toString() {
        return "Magazine :" + super.toString() +
                ", Is this hot news? " + isWithHotNews() + '\n';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Magazine that = (Magazine) o;
//
//        if (withHotNews != that.withHotNews) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return (withHotNews ? 1 : 0);
//    }
//
//    @Override
//    public int compareTo(Magazine o) {
//        return o.getAmountOfPages() - this.getAmountOfPages();
//    }


}

