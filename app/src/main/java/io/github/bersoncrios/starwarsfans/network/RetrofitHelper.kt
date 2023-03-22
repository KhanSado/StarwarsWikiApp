package io.github.bersoncrios.starwarsfans.network

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper(context: Context) {
     fun getInstance() : Retrofit {
         return Retrofit.Builder()
             .baseUrl("https://swapi.dev/api/")
             .client(client)
             .addConverterFactory(GsonConverterFactory.create())
             .build()
     }

    val client = OkHttpClient.Builder()
        .addInterceptor(ChuckerInterceptor(context))
        .build()
}