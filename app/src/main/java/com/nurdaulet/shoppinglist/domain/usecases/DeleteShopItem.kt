package com.nurdaulet.shoppinglist.domain.usecases

import com.nurdaulet.shoppinglist.domain.ShopItem
import com.nurdaulet.shoppinglist.domain.repository.ShopListRepository
import javax.inject.Inject

class DeleteShopItem @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}