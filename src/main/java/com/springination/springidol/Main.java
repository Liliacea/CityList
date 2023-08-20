package com.springination.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Cities cities = (Cities) ctx.getBean("cities") ;

        cities.cityList();
        ctx.close();
    }
}