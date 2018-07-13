package com.example.weather.cities.data.weather

import org.springframework.data.jpa.repository.JpaRepository

interface WeatherDao : JpaRepository<WeatherModel,Long> {
}