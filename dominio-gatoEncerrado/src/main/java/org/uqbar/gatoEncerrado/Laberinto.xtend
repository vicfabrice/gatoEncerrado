package org.uqbar.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors
class Laberinto {
	
	String nombreLaberinto
	String descripcion 
	
	ArrayList<Habitacion> habitaciones


	def new(String nombreLaberinto, String descripcion, String nombreHabitacion, String accion, String item, String itemDos) {
		// this.habitaciones = habs
	}

	def crear() {
		this.habitaciones = newArrayList
	}

	def agregarHabitacion(Habitacion nueva) {
		this.habitaciones.add(nueva)
	}

	// la habitacion la deberia pasar por parametro
	def definirHabitacionComoInicial(Habitacion start) {
		this.habitacionInicial = start
		start.esInicial = true
	}

	def definirHabitacionComoFinal(Habitacion finish) {
		this.habitacionFinal = finish
		finish.marcarFinal
	}

}
