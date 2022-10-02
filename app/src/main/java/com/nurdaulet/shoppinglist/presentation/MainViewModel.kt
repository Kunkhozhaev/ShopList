package com.nurdaulet.shoppinglist.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nurdaulet.shoppinglist.data.ShopListRepositoryImpl
import com.nurdaulet.shoppinglist.domain.ShopItem
import com.nurdaulet.shoppinglist.domain.usecases.DeleteShopItem
import com.nurdaulet.shoppinglist.domain.usecases.EditShopItem
import com.nurdaulet.shoppinglist.domain.usecases.GetShopList
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getShopListUseCase: GetShopList,
    private val deleteShopItemUseCase: DeleteShopItem,
    private val editShopItemUseCase: EditShopItem,
) : ViewModel() {

    //LiveData is to establish connection between MainActivity and ViewModel
    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        viewModelScope.launch {
            deleteShopItemUseCase.deleteShopItem(shopItem)
        }
    }

    fun changeEnableState(shopItem: ShopItem) {
        viewModelScope.launch {
            val newItem = shopItem.copy(enabled = !shopItem.enabled)
            editShopItemUseCase.editShopItem(newItem)
        }
    }

}