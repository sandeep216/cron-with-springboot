package com.example.weather.cities.data.weather

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "weather")
class WeatherModel : Serializable{

    @Column(name = "id")
    @Id
    private var id : Long = 0

    @Column(name = "coordinates")
    @JsonProperty(value = "coordinates")
    private var coordinates : String = ""

    @Column(name = "weather")
    @JsonProperty(value = "weather")
    private var weather : String = ""

    @Column(name = "base")
    @JsonProperty(value = "base")
    private var base : String = ""

    @Column(name = "main")
    @JsonProperty(value = "main")
    private var main : String = ""

    @Column(name = "visibility")
    @JsonProperty(value = "visibility")
    private var visibility : Long = 0

    @Column(name = "wind")
    @JsonProperty(value = "wind")
    private var wind : String = ""

    @Column(name = "clouds")
    @JsonProperty(value = "clouds")
    private var clouds : String = ""

    @Column(name = "time_stamp")
    @JsonProperty(value = "time_stamp")
    private var timestamp : Timestamp? = null

    @Column(name = "sys")
    @JsonProperty(value = "sys")
    private var sys : String = ""

    @Column(name = "weather_id")
    @JsonProperty(value = "weather_id")
    private var weatherId : Int = 0

    @Column(name = "name")
    @JsonProperty(value = "name")
    private var name : String = ""

    @Column(name = "cod")
    @JsonProperty(value = "cod")
    private var cod : Int = 0


    //Getters
    fun getId() : Long?{
        return id
    }

    fun getCoordinates() : String{
        return coordinates
    }

    fun getWeather() : String{
        return weather
    }

    fun getBase() : String{
        return base
    }

    fun getMain() : String{
        return main
    }

    fun getVisibility() : Long{
        return visibility
    }

    fun getWind() : String{
        return wind
    }

    fun getClouds() : String{
        return clouds
    }

    fun getTimestamp() : Timestamp?{
        return timestamp
    }

    fun getSys() : String{
        return sys
    }

    fun getWeatherId() : Int{
        return weatherId
    }

    fun getName() : String{
        return name
    }

    fun getCod() : Int{
        return cod
    }

    //Setters
    fun setId(id : Long){
        this.id = id
    }

    fun setCoordinates(coordinates: String){
        this.coordinates = coordinates
    }

    fun setWeather(weather : String){
        this.weather = weather
    }

    fun setBase(base : String){
        this.base = base
    }

    fun setMain(main : String){
        this.main = main
    }

    fun setVisibility(visibility : Long){
        this.visibility = visibility
    }

    fun setWind(wind : String){
        this.wind = wind
    }

    fun setClouds(clouds : String){
        this.clouds = clouds
    }

    fun setTimestamp(timestamp : Timestamp){
        this.timestamp = timestamp
    }

    fun setSys(sys: String){
        this.sys = sys
    }

    fun setWeatherId(weatherId : Int){
        this.weatherId = weatherId
    }

    fun setName(name: String){
        this.name = name
    }

    fun setCod(cod : Int){
        this.cod = cod
    }
}