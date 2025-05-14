# Kotlin MVVM ex2

## Table of contents

- [Architecture](#architecture)
- [Steps](#steps)
- [Resources](#resources)

## Architecture

View <-> ViewModel <-> Model

- Model
  - Local
  - Remote (Retrofit, firebase or any other api)

## Steps

- Create packages and files.
  - model
    - CounterData (data class)
    - CounterRepository (class)
  - view 
    - HomePage (file)
  - viewmodel
    - CounterViewModel (class)
- Define the data (CounterData).
- Use repo (CounterRepository) to grep data.
- Use `livedata` or `state` to store or update date in viewmodel (CounterViewModel).

## Resources

- [abhineshchandra1234/CounterMVVM - Counter App](https://github.com/abhineshchandra1234/CounterMVVM)
