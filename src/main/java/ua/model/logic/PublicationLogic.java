package ua.model.logic;

import ua.model.entity.PublicationEntity;

import java.util.List;

public abstract class PublicationLogic {


    public abstract List<PublicationEntity> sortByPages(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> sortByPopularity(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> sortByAutor(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> findByParameters(List<PublicationEntity> publ, Object o);


    public abstract PublicationEntity findByMinPages(PublicationEntity[] publ);

    public abstract PublicationEntity findByMaxPages(PublicationEntity[] publ);

    public abstract PublicationEntity getTheMostPopularPublication(PublicationEntity[] publ);
}
