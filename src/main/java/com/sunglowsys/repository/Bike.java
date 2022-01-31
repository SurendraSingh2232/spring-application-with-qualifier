package com.sunglowsys.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")

public class Bike implements Vehical{
    @Override
    public void start() {
        System.out.println("bike start");

    }

    @Override
    public void stop() {
        System.out.println("bike stop");

    }
}
