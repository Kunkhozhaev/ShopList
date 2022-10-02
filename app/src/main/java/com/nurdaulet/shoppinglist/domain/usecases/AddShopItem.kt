package com.nurdaulet.shoppinglist.domain.usecases

import com.nurdaulet.shoppinglist.domain.ShopItem
import com.nurdaulet.shoppinglist.domain.repository.ShopListRepository
import javax.inject.Inject

class AddShopItem @Inject constructor(private val shopListRepository: ShopListRepository){

    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}