package org.uqbar.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors
class Laberinto {
	
	String nombreLaberinto
	String descripcion 
	String nombreHabitacion
	String accion
	List <String> items
	
	
	ArrayList<Habitacion> habitaciones
	
	new() {
		super()	
	}


	new(String nombreLaberinto, String descripcion, String nombreHabitacion, String accion, String item, String itemDos) {
		
		this.nombreLaberinto = nombreLaberinto
		this.descripcion = descripcion
		this.nombreHabitacion = nombreHabitacion
		this.accion = accion
		this.items.add("item")
		this.items.add("itemDos")
	}


	
	// la habitacion la deberia pasar por parametro
	//def definirHabitacionComoInicial(Habitacion start) {
		//this.habitacionInicial = start
		//start.esInicial = true
	//}

	//def definirHabitacionComoFinal(Habitacion finish) {
		//this.habitacionFinal = finish
		//finish.marcarFinal
	//}

}
