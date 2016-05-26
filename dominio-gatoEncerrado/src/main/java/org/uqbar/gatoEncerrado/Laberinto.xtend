package org.uqbar.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors
class Laberinto {
	
	String nombreLaberinto
	String descripcion 

	String accion
	List <String> inventario
	
	ArrayList<String> habitaciones
	
	new() {
		super()	
	}


	new(String nombreLaberinto, String descripcion, String nombreHabitacion1,String nombreHabitacion2, String accion, String item, String itemDos) {
		
		this.nombreLaberinto = nombreLaberinto
		this.descripcion = descripcion
		this.habitaciones.add("nombreHabitacion1")
		this.habitaciones.add("nombreHabitacion2")
		this.accion = accion
		this.inventario.add("item")
		this.inventario.add("itemDos")
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
