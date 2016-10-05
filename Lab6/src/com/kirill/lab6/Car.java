package com.kirill.lab6;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Random;

/**
 * Created by Kirill on 01.10.2016.
 */
public class Car extends Thread {
    private int way;
    private String name;
    private int dellay;
    private boolean isRide=false;
    Car(){

    }
    Car(int way,String name){
        this.way=way;
        dellay = new Random().nextInt(2000)+2000;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Хэх, Здарова");
        while(!isRide){
            // примитив для синхронизации
                Thread.yield();
        }


    }
    public synchronized void ride(){
        System.out.println("Машина "+ name+" едет(я не знаю как это работает) в направлении "+way);
        isRide=true;
    }
    public synchronized void waitTime(){
        System.out.println("Машина "+ name+" ожидает( я не знаю как это работает)");
        try{
            Thread.yield();
            join(dellay);
        }catch (InterruptedException e){

        }

    }


    public String getNameCar() {
        return name;
    }


    public void setNameCar(String name) {
        this.name = name;
    }

    public boolean getIsCanRide() {
        return isRide;
    }

    public void setIsCanRide(boolean canRide) {
        this.isRide = canRide;
    }

    public int getWay() {
        return way;
    }

    public void setWay(int way) {
        this.way = way;
    }

    public int getDellay() {
        return dellay;
    }

    public void setDellay(int dellay) {
        this.dellay = dellay;
    }
}

