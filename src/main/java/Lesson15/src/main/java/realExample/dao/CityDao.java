package Lesson15.src.main.java.realExample.dao;

import Lesson15.src.main.java.realExample.pojo.City;

public interface CityDao {

    boolean addCity( City city);
 City getCityById( int id);
 City getCityByName(String name);
 boolean updateCity(City city);
 boolean deleteCityById( int id);
 boolean deleteCityBuName( City city);

}
