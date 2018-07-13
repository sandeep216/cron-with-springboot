package com.example.weather.cities.data


data class ResponsePojo(val success : Boolean, val errors : ArrayList<Error>, val data : ArrayList<HashMap<String,Any>>)