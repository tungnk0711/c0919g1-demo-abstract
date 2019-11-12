package com.codegym;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SportCar extends Car {
    @Override
    public void start() {
        System.out.println("Sport Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Sport Car Stop");
    }
}
