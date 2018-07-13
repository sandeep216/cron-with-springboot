package com.example.weather.cities.data.weathercron

import com.example.weather.cities.data.weather.WeatherModel
import retrofit2.Call
import retrofit2.http.GET

interface IWeatherCron {

    @GET("data/2.5/weather?id=400001&appid=b6907d289e10d714a6e88b30761fae22")
    fun fetchWeatherData() : Call<WeatherModel>
}