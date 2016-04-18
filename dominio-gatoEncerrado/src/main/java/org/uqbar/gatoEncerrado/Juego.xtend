package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List import org.uqbar.commons.utils.Observable



@Accessors
@Observable
class Juego {
	List<Laberinto> laberintos
	String admin 
	
	new(String nombreadmin){
		laberintos = newArrayList
		this.admin = nombreadmin
	}
		
	
	def void eliminarLaberinto(Laberinto noVaMas){
		this.laberintos.remove(noVaMas)
	}
	
	def void agregarLaberinto(Laberinto laberinto){
		laberintos.add(laberinto)
	}
}