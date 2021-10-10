package com.example.poo

interface Juego {
    val juego:String
    fun jugar()
    fun jugando(){
        println("Estoy jugando al $juego y es divertido")

    }
}