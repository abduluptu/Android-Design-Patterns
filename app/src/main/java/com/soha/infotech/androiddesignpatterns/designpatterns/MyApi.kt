package com.soha.infotech.androiddesignpatterns.designpatterns

import retrofit2.http.GET

/**
 * Step4: Facade design pattern
 *
 * Facade is the front-facing object that hides more complexity underneath it.
 */

interface MyApi {

    @GET("hamburger")
    suspend fun getHamburgers(): List<Hamburger>
}