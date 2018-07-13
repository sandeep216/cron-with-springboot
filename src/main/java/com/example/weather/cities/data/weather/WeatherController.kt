package com.example.weather.cities.data.weather

import com.example.weather.cities.data.Utils
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

    fun saveFetchedData(weatherModel: WeatherModel){
        try{
            weatherModel.setId(Utils.getUserId())
            weatherService.saveWeatherData(weatherModel)
        } catch (e : Exception){

        }
    }

}