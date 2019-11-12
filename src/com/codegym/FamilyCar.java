package com.codegym;

public class FamilyCar extends Car{

    public void showInfo(){
        System.out.println("Family Car Info");
    }

    @Override
    public void start() {
        System.out.println("Family Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Family Car Stop");
    }
}
