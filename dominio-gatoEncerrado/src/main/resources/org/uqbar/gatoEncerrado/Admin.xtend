package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List //para poder manejar listas

@Accessors
class Admin {
	
	List<Laberinto> laberintos 
	Habitacion nuevaHab

		
	def crearLaberinto(){
		laberitos = newArrayList		
	}
	
	def void modificarLaberinto(){}
	/*para mi conviene separarlo en por ej: cambiar nombre lab
	 * definir hab inicial nueva.. etc
	 */
	
	
	def void eliminarLaberinto(Laberinto noVaMas){
		this.laberintos.remove(noVaMas)
	}
	
	// fijarse estos metodos para abajo, no forman parte de la vista??
	def crearHabitacion(Sring conQueNombre){
		this.nuevaHab = new Habitacion()
	}
	
	
	def marcarHabitacion(){}
	
	def crearAccion(){}
	
	def eliminarHabitacion (){}
	
	
}