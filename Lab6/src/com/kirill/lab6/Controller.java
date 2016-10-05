package com.kirill.lab6;

import java.util.Random;

/**
 * Created by Kirill on 03.10.2016.
 */
public class Controller extends Thread{
    Road road;
    public Controller(Road road) {
    this.road = road;
    }

    @Override
    public void run() {
        System.out.println("Контроллер начал работу!");
        System.out.println("Текущее направление:" + road.getCorrectWay());
        while (road.getCarList().size()!=0) {
            for (Car car : road.getCarList()) {
                if (road.getCorrectWay() == car.getWay()) {
                    car.ride();
                } else {
                        car.waitTime();
                }
                // проверка на работу потока и его последующие удаление
                road.setCorrectWay(new Random().nextInt(2));
                System.out.println("Текущее направление:" + road.getCorrectWay());
            }
            road.removeFromList();

        }
        System.out.println("Контроллер закончил работу! " + "Машин в очереди:" + road.getCarList().size());
    }
}
