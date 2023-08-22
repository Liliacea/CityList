package com.springination.springidol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /* ArrayList<City>cities = new ArrayList<>();
        City moscow = new City("Moscow","12335654","RF");
        City spb = new City ("spb","456878797", "RF");
        cities.add(moscow);
        cities.add(spb);
        moscow.cityList();
        System.out.println(cities.get(0).toString());


        */

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

     //   ArrayList<City> cities = (ArrayList<City>)ctx.getBean("cities") ;
  //  ChosenCity city = (ChosenCity)ctx.getBean("chosenCity");
       // Map<String,String> map = (Map<String,String>)ctx.getBean("cityMap");
     // ArrayList<ChosenCity> bigCities = (ArrayList<ChosenCity>) ctx.getBean("bigCities");
      //  City bigCities = (City)ctx.getBean("bigCities");
        City cities = (City)ctx.getBean("allCities") ;
        ctx.close();




    }
}
