package com.kirill.lab6;

/**
 * Created by Kirill on 01.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car1= new Car(0,"Работяга 1");
        Car car2= new Car(1,"Очередняра 2");
        Car car3= new Car(1,"Работяга 3");
        Car car4= new Car(0,"Очередняра 4");
        Car car5= new Car(0,"Работяга 5");
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        Road road = new Road();
        road.addCar(car1);
        road.addCar(car2);
        road.addCar(car3);
        road.addCar(car4);
        road.addCar(car5);
        Controller controller= new Controller(road);
        controller.start();
    }
}
