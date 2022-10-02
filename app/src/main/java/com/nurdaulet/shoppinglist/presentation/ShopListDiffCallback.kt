package com.nurdaulet.shoppinglist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.nurdaulet.shoppinglist.domain.ShopItem

class ShopListDiffCallback(
    private val oldList: List<ShopItem>,
    private val newList: List<ShopItem>
) : DiffUtil.Callback(){
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        //Make sure that these are the same shopItems
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        // "oldItem == newItem" calls ".equals()" method. It is overrided in data class.
        // It checks for equality every field in the constructor
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}