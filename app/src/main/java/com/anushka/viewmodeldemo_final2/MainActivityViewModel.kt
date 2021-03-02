package com.anushka.viewmodeldemo_final2

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingCount : Int) : ViewModel() {
    private var count = startingCount

    fun getCurrentCount():Int{
        return count
    }

    fun getUpdatedCount():Int{
        return ++count
    }
}