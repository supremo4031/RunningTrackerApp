package com.arpan.runningtrackerapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.arpan.runningtrackerapp.repositories.MainRepository
import javax.inject.Inject



class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {


}