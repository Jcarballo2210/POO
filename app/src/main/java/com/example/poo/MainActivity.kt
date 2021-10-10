package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // claseHerencia()
       // claseInterface()
        modificacoresdeVisibilidad()
    }

    private fun claseHerencia(){

        val cocinero = Cocinero("Carlos",25,"Italiana")
       // cocinero.trabajar()
        cocinero.voyATrabajar()
       // cocinero.estiloDeCocina()
        cocinero.conducir()

     //   val carpintero = Carpintero("Juan",22)
      //  carpintero.trabajar()

    }

    private fun claseInterface(){
        val jugador = Persona("Mauricio",23)
        jugador.jugar()
        jugador.jugando()

    }

    private fun modificacoresdeVisibilidad(){
      /* val visible = Visibilidad()
        visible.nombre = null
        visible.decirMiNombre()*/
    }

}