package com.nurdaulet.shoppinglist.presentation

import android.app.Application
import com.nurdaulet.shoppinglist.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}