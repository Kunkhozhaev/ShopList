package com.nurdaulet.shoppinglist.di

import android.app.Application
import com.nurdaulet.shoppinglist.data.AppDatabase
import com.nurdaulet.shoppinglist.data.ShopListDao
import com.nurdaulet.shoppinglist.data.ShopListRepositoryImpl
import com.nurdaulet.shoppinglist.domain.repository.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun providesShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}