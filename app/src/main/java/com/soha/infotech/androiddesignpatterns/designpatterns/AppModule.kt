package com.soha.infotech.androiddesignpatterns.designpatterns

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Step5: Dependency Injection
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideHamburger(): Hamburger {
        return Hamburger.Builder()
            .cheese(true)
            .chicken(true)
            .onions(true)
            .build()
    }
}