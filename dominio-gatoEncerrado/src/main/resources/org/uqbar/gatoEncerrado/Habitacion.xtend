package org.uqbar.gatoEncerrado

@Accessors
class Habitacion {
	
	var String nombreHabitacion
	// la habitacion lleva un nombre: ej Cocina
	var List habitacionesPermitidas
	var Item itemDisponible
	var Boolean esInicial
	var Boolean esFinal
	
	/*una habitacion puede ser inicial y final en un mismo laberinto
	 * por ejemplo: laberinto: "Cursar Programacion UI"
	 * habitacion: "Aula 60"
	 */
	
	def crearHabitacion(String unNombre){
		this.nombreHabitacion = unNombre
		this.esInicial = False
		this.esFinal = False
	}
	
	def marcarInicial(){
		this.esInicial = True
	}
	
	def marcarFinal(){
		this.esFinal = True
	}
	
	def desmarcarInicial(){
		this.esInicial = False
	}
	
	def desmarcarFinal(){
		this.esFinal = False
	}
	def usarItem(){}
		
	def agarrarItem(){}
	
	def salirDeLaberinto(){}
}