package org.uqbar.gatoEncerrado

class AccionIrAHabitacion extends Accion{
	Habitacion destino
	
	new(){
		super()
	}
	
	new (Habitacion lugar){
		destino = lugar
	}
}