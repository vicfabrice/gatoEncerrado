package org.uqbar.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

@Accessors
class Laberinto {
	String nombreLaberinto
	List<Habitacion> habitaciones

	Habitacion habitacionInicial
	Habitacion habitacionFinal

	def crear(List<Habitacion> habs) {
		this.habitaciones = habs
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
