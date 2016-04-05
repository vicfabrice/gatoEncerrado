package org.uqbar.gatoEncerrado

@Accessors 
class Laberinto {
	
	var List<Habitacion> habitaciones
	var Habitacion habInicial
	var Habitacion habFinal 
	
	def crear(List<Habitacion> habs){
		
		this.habitaciones = habs
		
	}
	
	def agregarHabitacion(){}
	
	def definirHabitacionComoInicial(){} 
	
	def definirHabitacionComoFinal(){}
	
	
}