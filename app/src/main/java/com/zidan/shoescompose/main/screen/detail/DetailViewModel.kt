package com.zidan.shoescompose.main.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zidan.shoescompose.data.ShoesRepository
import com.zidan.shoescompose.main.common.UiState
import com.zidan.shoescompose.model.OrderShoes
import com.zidan.shoescompose.model.Shoes
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel (
    private val repository: ShoesRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<OrderShoes>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<OrderShoes>>
        get() = _uiState

    fun getRewardById(rewardId: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getOrderRewardById(rewardId))
        }
    }

    fun addToCart(reward: Shoes, count: Int) {
        viewModelScope.launch {
            repository.updateOrderReward(reward.id, count)
        }
    }
}