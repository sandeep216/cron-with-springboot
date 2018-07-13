package com.example.weather.cities.data

import com.example.weather.cities.data.weather.WeatherModel
import com.example.weather.cities.data.weather.WeatherService
import com.example.weather.cities.data.weathercron.IWeatherCron
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Component
class EventCreator {

    @Autowired
    lateinit var weatherService: WeatherService

    @Scheduled(fixedRate = 60000)
    fun create() {
        try {
            val weatherCron = Utils.getRetrofit().create(IWeatherCron :: class.java)
            val call = weatherCron.fetchWeatherData()
            val callback = object  : Callback<WeatherModel>{
                override fun onResponse(p0: Call<WeatherModel>?, p1: Response<WeatherModel>?) {
                    if (p1!!.isSuccessful){
                        val weatherModel = p1.body()

                    } else {

                    }
                }

                override fun onFailure(p0: Call<WeatherModel>?, p1: Throwable?) {

                }
            }

            call.enqueue(callback)
        } catch (e: Exception) {

        }
    }
}