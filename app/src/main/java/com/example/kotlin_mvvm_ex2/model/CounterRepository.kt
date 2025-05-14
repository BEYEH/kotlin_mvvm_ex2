package com.example.kotlin_mvvm_ex2.model

class CounterRepository {
    private var _counter = CounterData(0)

    fun updateCounter(delta: Int): CounterData {
        _counter = _counter.copy(count = _counter.count + delta)
        return _counter
    }
}