package org.uqbar.gatoEncerrado.appModels

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.gatoEncerrado.Juego
import org.uqbar.gatoEncerrado.Laberinto
import java.util.List
import org.uqbar.gatoEncerrado.Habitacion
import org.uqbar.gatoEncerrado.Accion

@Observable
@Accessors
class JuegoAppModel {
	
	Juego juego
	Laberinto laberintoSeleccionado
	Habitacion habitacionSeleccionada
	String nombreHabitacion
	String admin
	Accion accionSeleccionada
	
	new(Juego j){
		this.juego = j
		this.admin = juego.admin
	}
	
	def List<Laberinto> getLaberintos(){
		this.juego.laberintos
	}
	
}