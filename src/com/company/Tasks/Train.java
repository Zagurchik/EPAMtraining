package com.company.Tasks;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления*/
public class Train {
     String stationName;
     int number;
     Date departureTime;
    static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    public Train(String stationName, int number, Date departureTime) {
        this.stationName = stationName;
        this.number = number;
        this.departureTime = departureTime;
    }

    static void TrainSort (List<Train> trains){
        Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.number - o2.number;
            }
        }
        );
    }

    static String PrintTrain (List<Train> trains, int number) {
        Train traini = null;
        for (Train train : trains) {
            if (train.number != number) {
                continue;
            } else traini = train;
        } return traini.toString();
    }


    static void SortStationName (List<Train> trains){
        Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
              int result = o1.stationName.compareTo(o2.stationName);
              if (result == 0){
                  return o1.departureTime.compareTo(o2.departureTime);
              }
                return result;
            }
        });
    }

    @Override
    public String toString() {
        return "Train: " +
                "stationName='" + stationName + '\'' +
                ", number=" + number +
                ", departureTime=" + departureTime +
                 '\n';
    }
}

