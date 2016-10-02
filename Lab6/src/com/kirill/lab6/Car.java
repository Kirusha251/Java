package com.kirill.lab6;

/**
 * Created by Kirill on 01.10.2016.
 */
public class Car extends Thread {
    private int way;
    private int dellay;
    private boolean isCanRide;
    @Override
    public void run() {
        super.run();
    }
    public synchronized void ride(){
        if(isCanRide){

        }
        else{

        }
    }

    public boolean getIsCanRide() {
        return isCanRide;
    }

    public void setIsCanRide(boolean canRide) {
        this.isCanRide = canRide;
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

