package org.uqbar.gatoEncerrado

@Accessors 
class Laberinto {
	
	var String nombreLaberinto 
	//viendo el ej de las ultimas paginas el lab lleva nombre, ej: casa
	var List<Habitacion> habitaciones
	
	//ser inicial y / o final pueden ser atributos booleanos de la habitacion
	var Habitacion habInicial
	var Habitacion habFinal 
	
	def crear(List<Habitacion> habs){
		this.habitaciones = habs
	}
	
	/*
	 * podremos crear un laberinto vacio??
	 * o sea crear el laberinto y luego modificarlo
	 * para agregarle habitaciones o para eliminarlo (se arrepintio el 
	 * admin de crear un nuevo laberinto), etc...
	 * 
	 * def crear (){
	 * this.habitaciones = newArrayList
	 * }
	 */
		
	def agregarHabitacion(Habitacion nueva){
		this.habitaciones.add(nueva)
	}
	
	def definirHabitacionComoInicial(Habitacion start){
		this.habitacionInicial = start
		start.marcarIncicial()
	} 
	
	def definirHabitacionComoFinal(Habitacion finish){
		this.habitacionFinal = finish
		finish.marcarFinal
	}
	
	
}