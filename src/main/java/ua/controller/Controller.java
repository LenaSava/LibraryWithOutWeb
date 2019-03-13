package ua.controller;
import ua.model.entity.PublicationType;
import ua.model.entity.PublicationEntity;
import ua.model.logic.PublicationSort;
import ua.view.ConsolePrinter;


import java.io.IOException;
import java.util.*;

public class Controller {
    private static Random rnd = new Random();

    public static void main(String[] args) throws IOException {
        ConsolePrinter printer = new ConsolePrinter();
        PublicationSort albumLogic = new PublicationSort();
        List<PublicationEntity> model = new ArrayList<>();

        PublicationEntity scientPub = PublicationType.valueOf("SCIENTIFICRESERCH").factory();
        model.add(scientPub);
        PublicationEntity scientPub2 = PublicationType.valueOf("SCIENTIFICRESERCH2").factory();
        model.add(scientPub2);
        PublicationEntity scientPub3 = PublicationType.valueOf("SCIENTIFICRESERCH3").factory();
        model.add(scientPub3);
        PublicationEntity scientBook = PublicationType.valueOf("BOOK").factory();
        model.add(scientBook);
        PublicationEntity scientBook2 = PublicationType.valueOf("BOOK2").factory();
        model.add(scientBook2);
        PublicationEntity scientBook3 = PublicationType.valueOf("BOOK3").factory();
        model.add(scientBook3);
        PublicationEntity magazine = PublicationType.valueOf("MAGAZINE").factory();
        model.add(magazine);
        PublicationEntity magazine2 = PublicationType.valueOf("MAGAZINE2").factory();
        model.add(magazine2);
        PublicationEntity magazine3 = PublicationType.valueOf("MAGAZINE3").factory();
        model.add(magazine3);



        printer.print(model);

        albumLogic.sortByPopularity(model);

        printer.print(model);
//
//        albumLogic.sortByPages(model);
//
//        System.out.println(model);
//
//        albumLogic.findByParameters(model, "Well");
//
//
//        System.out.println(model + "Sort by param");
//
//        albumLogic.sortByAutor(model);
//
//        System.out.println(model);


//
//        ae[0] = new Booklet(15,
//                "SpaceLearning","Fresko","Science",
//                8,
//                "Bad");
//        ae[1] = new Booklet(23,
//                "Master and Margarita","Bulgakov","Novel",
//                15,
//                "Good");
//        ae[2] = new Booklet(22,
//                "Mumu","Turhenev","Story",
//                1,
//                "Well");
//        fp.print(Arrays.toString(albumLogic.sortByPages(ae)));
//        fp.print(String.valueOf(albumLogic.findByMaxPages(ae)));
//        fp.print(String.valueOf(albumLogic.findByMinPages(ae)));
//        fp.print(String.valueOf(albumLogic.getTheMostPopularPublication(ae)));
//        fp.print(Arrays.toString(albumLogic.sortByPopularity(ae)));
//        fp.print(Arrays.toString(albumLogic.findByParameters(ae, "Well")));
//
//        Arrays.sort(ae);
//        System.out.println(Arrays.toString(ae));
    }
}