package com.example.punkbeerapplication.api

import com.example.punkbeerapplication.api.response.Beer
import io.reactivex.Observable
import retrofit2.http.GET

interface BeerApi {
    @GET("/v2/beers")
    fun getAllBeers(): Observable<ArrayList<Beer>>
}