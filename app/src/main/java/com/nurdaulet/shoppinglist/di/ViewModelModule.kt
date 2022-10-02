package com.nurdaulet.shoppinglist.di

import androidx.lifecycle.ViewModel
import com.nurdaulet.shoppinglist.presentation.MainViewModel
import com.nurdaulet.shoppinglist.presentation.ShopItemViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(viewmodel: MainViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(ShopItemViewModel::class)
    fun bindShopItemViewModel(viewmodel: ShopItemViewModel): ViewModel
}