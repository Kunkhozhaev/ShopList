package com.nurdaulet.shoppinglist.domain.usecases

import com.nurdaulet.shoppinglist.domain.ShopItem
import com.nurdaulet.shoppinglist.domain.repository.ShopListRepository
import javax.inject.Inject

class GetShopItem @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}