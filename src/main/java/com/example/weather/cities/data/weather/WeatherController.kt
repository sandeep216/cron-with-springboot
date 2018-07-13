package com.example.weather.cities.data.weather

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Controller

@Controller
class WeatherController : IWeather.ServiceToController{

    @Autowired
    lateinit var weatherService: WeatherService

    fun getAllWeatherData(){
        try{
            weatherService.getAllWeatherData()
        }catch (e :Exception){

        }
    }

    @Scheduled(fixedRate = 5000)
    fun saveFetchedData(weatherModel: WeatherModel){
        try{
            weatherService.saveWeatherData(weatherModel)
        } catch (e : Exception){

        }
    }

}