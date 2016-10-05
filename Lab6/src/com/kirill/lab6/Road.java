package com.kirill.lab6;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by Kirill on 03.10.2016.
 */
public class Road {
    private int correctWay;
    private ArrayList<Car> carList;
    public Road() {
        this.correctWay = new Random().nextInt(2);
        this.carList = new ArrayList<>();
    }
    public void removeFromList(){
        ArrayList<Car> index= new ArrayList<>();
        for (Car car: carList
             ) {
            if(!car.isAlive()){
                index.add(car);
            }
        }
        for (Car i:index
             ) {
            carList.remove(i);
        }
    }
    public void addCar(Car car){
        carList.add(car);
    }
    public int getCorrectWay() {
        return correctWay;
    }

    public void setCorrectWay(int correctWay) {
        this.correctWay = correctWay;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
}
