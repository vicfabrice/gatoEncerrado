package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List import org.uqbar.commons.utils.Observable

//para poder manejar listas

@Accessors
@Observable
class Juego {
	List<Laberinto> laberintos 
	
	new(){
		laberintos = newArrayList
	}
		
	
	def void eliminarLaberinto(Laberinto noVaMas){
		this.laberintos.remove(noVaMas)
	}
	
	def void agregarLaberinto(Laberinto laberinto){
		laberintos.add(laberinto)
	}
}