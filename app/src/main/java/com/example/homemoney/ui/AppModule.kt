package com.example.homemoney.ui

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    /**
     * Предоставляет экземпляр NavigationHandler, внедряемый в MenuViewModel.
     * @param context Контекст приложения.
     * @return Экземпляр NavigationHandler.
     */
    @Provides
    @Singleton
    fun provideNavigationHandler(@ApplicationContext context: Context): NavigationHandler {
        return NavigationHandler(context)
    }
}