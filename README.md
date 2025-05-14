# Kotlin MVVM ex2

## Table of contents

- [Architecture](#architecture)
- [Note](#note)
- [Steps](#steps)
- [Resources](#resources)

## Architecture

View <-> ViewModel <-> Model

- Model
  - Local
  - Remote (Retrofit, firebase or any other api)

## Note

- UI = UI elements + UI state
  - UI elements: Activities, Fragments
- UI Layer Pipeline
  1. App data -> UI data
  2. UI data -> UI elements
  3. User events -> UI changes
  4. Repeat
- UI Layer Concepts
  1. Define UI state
  2. Production of UI state
  3. Expose UI state
  4. Consume UI state
- ViewModel and UI pipeline
  1. ViewModel exposes UI state
  2. UI notifies ViewModel of events
  3. ViewModel updates state and is consumed by the UI
  4. Repeat as necessary

## Steps

- Create packages and files.
  - model
    - CounterData (data class)
    - CounterRepository (class)
  - view (HomePage)
    - file
  - viewmodel (CounterViewModel)
    - class
    - Extend ViewModel().
    - State holder.
- Define the data (CounterData).
- Use repo (CounterRepository) to grep data.
- Use `livedata` or `state` to store or update data in viewmodel (CounterViewModel).
- Use `observeAsState` keep tracking the data in the view (HomePage).

## Resources

- [abhineshchandra1234/CounterMVVM - Counter App](https://github.com/abhineshchandra1234/CounterMVVM)
