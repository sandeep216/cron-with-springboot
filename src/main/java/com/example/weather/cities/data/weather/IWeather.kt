package com.example.weather.cities.data.weather

interface IWeather {

    interface ControllerToService{
        fun getAllWeatherData()
        fun getOneWeatherData()
        fun saveWeatherData(weatherModel: WeatherModel)
    }

    interface ServiceToController{

    }
}