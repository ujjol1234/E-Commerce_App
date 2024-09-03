package com.zidan.shoescompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zidan.shoescompose.data.ShoesRepository
import com.zidan.shoescompose.main.screen.cart.CartViewModel
import com.zidan.shoescompose.main.screen.detail.DetailViewModel
import com.zidan.shoescompose.main.screen.home.HomeViewModel

class ViewModelFactory(private val repository: ShoesRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(CartViewModel::class.java)) {
            return CartViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}