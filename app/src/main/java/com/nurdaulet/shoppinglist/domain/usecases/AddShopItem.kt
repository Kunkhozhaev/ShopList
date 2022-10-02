package com.nurdaulet.shoppinglist.domain.usecases

import com.nurdaulet.shoppinglist.domain.ShopItem
import com.nurdaulet.shoppinglist.domain.repository.ShopListRepository

class AddShopItem(private val shopListRepository: ShopListRepository){

    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}