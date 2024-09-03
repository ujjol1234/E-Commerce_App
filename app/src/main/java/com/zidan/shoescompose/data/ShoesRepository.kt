package com.zidan.shoescompose.data

import com.zidan.shoescompose.model.FakeDataShoes
import com.zidan.shoescompose.model.OrderShoes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map

class ShoesRepository {

    private val orderRewards = mutableListOf<OrderShoes>()

    init {
        if (orderRewards.isEmpty()) {
            FakeDataShoes.dummyRewards.forEach {
                orderRewards.add(OrderShoes(it, 0))
            }
        }
    }

    fun getAllRewards(): Flow<List<OrderShoes>> {
        return flowOf(orderRewards)
    }

    fun getOrderRewardById(rewardId: Long): OrderShoes {
        return orderRewards.first {
            it.shoes.id == rewardId
        }
    }

    fun updateOrderReward(rewardId: Long, newCountValue: Int): Flow<Boolean> {
        val index = orderRewards.indexOfFirst { it.shoes.id == rewardId }
        val result = if (index >= 0) {
            val orderReward = orderRewards[index]
            orderRewards[index] =
                orderReward.copy(shoes = orderReward.shoes, count = newCountValue)
            true
        } else {
            false
        }
        return flowOf(result)
    }

    fun getAddedOrderRewards(): Flow<List<OrderShoes>> {
        return getAllRewards()
            .map { orderRewards ->
                orderRewards.filter { orderReward ->
                    orderReward.count != 0
                }
            }
    }

    companion object {
        @Volatile
        private var instance: ShoesRepository? = null

        fun getInstance(): ShoesRepository =
            instance ?: synchronized(this) {
                ShoesRepository().apply {
                    instance = this
                }
            }
    }

}