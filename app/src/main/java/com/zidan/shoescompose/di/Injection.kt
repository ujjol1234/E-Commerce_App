package com.zidan.shoescompose.di

import com.zidan.shoescompose.data.ShoesRepository

object Injection {
    fun provideRepository(): ShoesRepository {
        return ShoesRepository.getInstance()
    }
}