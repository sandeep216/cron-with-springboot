package com.example.weather.cities.data.weather

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class WeatherService : IWeather.ControllerToService {

    @Autowired
    lateinit var weatherController: WeatherController

    @Autowired
    lateinit var weatherDao: WeatherDao

    override fun saveWeatherData(weatherModel: WeatherModel) {
        try{
            weatherDao.save(weatherModel)
        } catch (e : Exception){

        }
    }

    override fun getAllWeatherData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOneWeatherData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}