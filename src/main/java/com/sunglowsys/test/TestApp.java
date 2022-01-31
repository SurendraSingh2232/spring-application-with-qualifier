package com.sunglowsys.test;

import com.sunglowsys.service.VehicalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // scane beans

        context.scan("com.sunglowsys.repository");
        context.scan("com.sunglowsys.service");
        context.refresh();

        VehicalService vehical = context.getBean(VehicalService.class);
        vehical.service();
        context.close();
    }
}
