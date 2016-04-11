package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors 
class Laberinto {
	
	String nombreLaberinto 
	List<Habitacion> habitaciones
	
	Habitacion habInicial
	Habitacion habFinal 
	
	def crear(List<Habitacion> habs){
		this.habitaciones = habs
	}
		
	
	def crear (){
	  	this.habitaciones = List<Habitacion>
	  }
	 
		
	def agregarHabitacion(Habitacion nueva){
		this.habitaciones.add(nueva)
	}
	
	// la habitacion la deberia pasar por parametro
	def definirHabitacionComoInicial(Habitacion start){
		this.habitacionInicial = start
		start.marcarIncicial() 
	} 
	
	def definirHabitacionComoFinal(Habitacion finish){
		this.habitacionFinal = finish
		finish.marcarFinal
	}
	
	
}