package ro.itschool.project.services;

import ro.itschool.project.models.entities.Weather;

import java.io.IOException;

public interface WeatherService {

    Weather getWeather(String city) throws IOException;
}
