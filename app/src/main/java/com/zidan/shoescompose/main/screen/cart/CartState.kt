package com.zidan.shoescompose.main.screen.cart

import com.zidan.shoescompose.model.OrderShoes

data class CartState(
    val orderReward: List<OrderShoes>,
    val totalRequiredPoint: Int
)
