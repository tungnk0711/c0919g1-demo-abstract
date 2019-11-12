package com.codegym;

public class AirPlane implements FlyAble, RunAble{
    @Override
    public void fly() {
        System.out.println("Airplane Fly..");
    }

    @Override
    public void run() {
        System.out.println("Airplane Run..");
    }
}
