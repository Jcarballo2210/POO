package com.example.poo

class Cocinero(nombre:String,edad:Int,val tipoDeCocina:String):Persona(nombre,edad), Vehiculo{

    override fun trabajar(){
        println("Esta persona esta cortando verduras")
    }
    fun estiloDeCocina(){
        println("El estilo de este cocinero es $tipoDeCocina")
    }

   override fun voyATrabajar(){
        println("va a trabajar a un comedor")
    }

    override fun conducir(){
        println("Esta persona ahora conduce un carro")
    }

}