package com.nurdaulet.shoppinglist.domain.usecases

import androidx.lifecycle.LiveData
import com.nurdaulet.shoppinglist.domain.ShopItem
import com.nurdaulet.shoppinglist.domain.repository.ShopListRepository

class GetShopList(private val shopListRepository: ShopListRepository) {

    fun getShopList():LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}