package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SportCar sportCar = new SportCar();
        sportCar.start();
        sportCar.stop();

        AirPlane airPlane = new AirPlane();
        airPlane.fly();
        airPlane.run();

        ConnectDatabase connectDatabase = new ConnectDatabase() {
            @Override
            public String info() {
                return "shoponline_database";
            }
        };

        String result = connectDatabase.info();
        System.out.println(result);


    }
}
