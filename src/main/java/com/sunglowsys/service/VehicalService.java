package com.sunglowsys.service;

import com.sunglowsys.repository.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicalService {

    @Autowired
    @Qualifier("carBean")
    private Vehical vehical;

    public void service(){
        vehical.start();
        vehical.stop();
    }
}
