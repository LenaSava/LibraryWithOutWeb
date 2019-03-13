package ua.model.logic;

import ua.model.entity.Booklet;
import ua.model.entity.PublicationEntity;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PublicationSort extends PublicationLogic {

    @Override
    public List<PublicationEntity> sortByPages(List<PublicationEntity> publ) {
        publ.sort(Comparator.comparing(PublicationEntity::getAmountOfPages));
        return publ;

    }


    @Override
    public List<PublicationEntity> sortByPopularity(List<PublicationEntity> publ) {
        publ.sort(Comparator.comparing(PublicationEntity::getPopularity));
        return publ;

    }

    @Override
    public List<PublicationEntity> sortByAutor(List<PublicationEntity> publ) {
        publ.sort(Comparator.comparing(PublicationEntity::getAuthor));
        return publ;

    }
    @Override
    public List<PublicationEntity> findByParameters(List<PublicationEntity> publ, Object qualityOfPaper) {
        publ.stream().filter(x -> !qualityOfPaper.equals(x.getQualityOfPaper())).collect(Collectors.toList());

        return publ;
    }


    @Override
    public Booklet findByMinPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        Booklet ae = (Booklet) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp > publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (Booklet) publ[i];
            }
        }
        return ae;
    }


    @Override
    public Booklet findByMaxPages(PublicationEntity[] publ) {
        int temp = publ[0].getAmountOfPages();
        Booklet ae = (Booklet) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getAmountOfPages()) {
                temp = publ[i].getAmountOfPages();
                ae = (Booklet) publ[i];
            }
        }
        return ae;
    }

    @Override
    public Booklet getTheMostPopularPublication(PublicationEntity[] publ) {
        int temp = publ[0].getPopularity();
        Booklet ae = (Booklet) publ[0];
        for (int i = 0; i < publ.length - 1; i++) {
            if (temp < publ[i].getPopularity()) {
                temp = publ[i].getPopularity();
                ae = (Booklet) publ[i];
            }
        }
        return ae;
    }



}
