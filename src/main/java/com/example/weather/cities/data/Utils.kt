package com.example.weather.cities.data

import retrofit2.Retrofit
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import com.sun.corba.se.impl.activation.CommandHandler.parseError
import okhttp3.Interceptor
import org.springframework.http.HttpHeaders.AUTHORIZATION
import java.io.IOException
import org.springframework.lang.NonNull
import java.util.*


object Utils {

    fun getRetrofit()  : Retrofit{

        val httpClient = OkHttpClient.Builder()

        httpClient.addInterceptor { chain ->
            val request = chain.request().newBuilder().build()
            val response = chain.proceed(request)
            response
        }.connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS)

        /*httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Response response = chain.proceed(request);
                if (response.code() == AUTH_TOKEN_EXPIRED){
                    // TO-DO
                    ExpireTokenObserver.send(true);
                }

                return response;
            }
        });*/

        val _builder = Retrofit.Builder()
                .baseUrl("https://samples.openweathermap.org/")

        val client = httpClient.build()
        return _builder.client(client).build()

    }

    fun getUserId() : Long{
        val rand  =  Random()
        rand.longs(10,1000)
        return rand.nextLong()
    }

}