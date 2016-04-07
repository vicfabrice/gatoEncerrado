package org.uqbar.gatoEncerrado

import java.util.List //para poder manejar listas

@Accessors
class Admin {
	
	var List<Laberinto> laberintos 

		
	def crearLaberinto(){
		laberitos = newArrayList		
	}
	
	def void modificarLaberinto(){}
	
	
	def void eliminarLaberinto(Laberinto noVaMas){
		this.laberintos.remove(noVaMas)
	}
	
	/* no es responsabilidad de la habitacion??
	 * def crearHabitacion(Sring conQueNombre){
	 * Habitacion crear(conQueNombre)
	 * }
	*/
	
	def marcarHabitacion(){}
	
	def crearAccion(){}
	
	def eliminarHabitacion (){}
	
	
}