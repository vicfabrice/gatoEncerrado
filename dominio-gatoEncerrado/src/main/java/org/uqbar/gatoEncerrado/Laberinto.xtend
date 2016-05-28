package org.uqbar.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors
class Laberinto {
	
	Integer idLaberinto 
	String nombreLaberinto
	String descripcion 
	Integer idHabitacion
	ArrayList<String> items
	ArrayList<Habitacion> habitaciones
	ArrayList<String> nombreHabitaciones
	String habInicial
	String habFinal
	
	new() {
		super()	
	}


	new(Integer idLaberinto, String nombreLaberinto, String descripcion, String nombreHabitacion1,String nombreHabitacion2, String accion1, String accion2, String item, String itemDos) {
		
		this.idLaberinto = idLaberinto
		this.nombreLaberinto = nombreLaberinto
		this.descripcion = descripcion
		this.habitaciones.addHabitacion("nombreHabitacion1", accion1)
		this.habitaciones.addHabitacion("nombreHabitacion2", accion2)
		this.items.add("item")
		this.items.add("itemDos")
		this.idHabitacion =1
	}
	
	def addHabitacion(ArrayList<Habitacion> habitaciones, String unstring,String accion) {
		val habitacionNueva = new Habitacion (idHabitacion, unstring,accion)
		idHabitacion = idHabitacion +1
		if (idHabitacion == 1){
			habInicial = habitacionNueva.getNombre()
		}
		else habFinal = habitacionNueva.getNombre()
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
