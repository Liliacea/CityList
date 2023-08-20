package com.springination.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<City>cities = new ArrayList<>();
        City moscow = new City("Moscow","12335654","RF");
        City spb = new City ("spb","456878797", "RF");
        cities.add(moscow);
        cities.add(spb);
        moscow.cityList();
        System.out.println(cities.get(0).toString());


        /*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Cities cities = (Cities) ctx.getBean("cities") ;

        cities.cityList();
        ctx.close();


         */

    }
}
