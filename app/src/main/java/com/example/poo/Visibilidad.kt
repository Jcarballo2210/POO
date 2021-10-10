package com.example.poo

private class Visibilidad {
    private var nombre:String?="Luis"
    private fun decirMiNombre(){
        nombre?.let{
            println("Mi nombre es $it")
        }?:run{
            println("No se escribio un nombre")
        }
    }
}

open class Visibilidad2(){
    protected fun decirMiNombre2(){
        val visible = Visibilidad()
    }
}

class Visibilidad3():Visibilidad2(){
    val edad:Int?= null
    fun decirMiNombreOtraVez(){
        decirMiNombre2()
    }
}

