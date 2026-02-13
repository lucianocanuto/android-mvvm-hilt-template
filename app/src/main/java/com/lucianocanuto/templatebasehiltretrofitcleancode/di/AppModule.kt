package com.lucianocanuto.templatebasehiltretrofitcleancode.di

import com.lucianocanuto.templatebasehiltretrofitcleancode.data.MensangemRepositoryImpl
import com.lucianocanuto.templatebasehiltretrofitcleancode.domain.MensagemRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun proverMensagemRepository(
        implementar: MensangemRepositoryImpl
    ) : MensagemRepository{
        return implementar
    }



    /*fun proverNomeApp(): String{
        return "Template Base v0.1 \uD83D\uDE80"
    }*/

}