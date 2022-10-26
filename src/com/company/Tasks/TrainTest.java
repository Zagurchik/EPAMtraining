package com.company.Tasks;

import java.text.ParseException;
import java.util.LinkedList;

import static com.company.Tasks.Train.ft;


public class TrainTest {
    public static void main(String[] args) throws ParseException {
        LinkedList<Train> trains = new LinkedList<>();
        trains.add(new Train("Minsk", 15, ft.parse("15:30")));
        trains.add(new Train("Minsk", 14, ft.parse("02:30")));
        trains.add(new Train("Mogilev", 10, ft.parse("14:25")));
        trains.add(new Train("Vitebsk", 24, ft.parse("09:30")));
        trains.add(new Train("Grodno", 3, ft.parse("05:30")));

        //System.out.print(Train.PrintTrain(trains,15));
        System.out.println(trains.toString());
        Train.TrainSort(trains);
        System.out.println(trains.toString());
        Train.SortStationName(trains);
        System.out.println(trains.toString());

    }
}
