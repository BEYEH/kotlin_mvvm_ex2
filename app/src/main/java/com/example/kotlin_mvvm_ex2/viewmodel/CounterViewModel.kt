package com.example.kotlin_mvvm_ex2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_mvvm_ex2.model.CounterData
import com.example.kotlin_mvvm_ex2.model.CounterRepository
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {
    val counterRepo: CounterRepository = CounterRepository()

    private val _counterData = MutableLiveData<CounterData>()
    val counterData: LiveData<CounterData> = _counterData

    fun increment() {
        viewModelScope.launch {
            val counterResult = counterRepo.updateCounter(1)
            _counterData.postValue(counterResult)
        }
    }

    fun decrement() {
        viewModelScope.launch {
            val counterResult = counterRepo.updateCounter(-1)
            _counterData.postValue(counterResult)
        }
    }
}