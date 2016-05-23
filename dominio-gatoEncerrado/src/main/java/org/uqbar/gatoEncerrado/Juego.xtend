package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.ArrayList
import java.util.Collection

@Accessors
@Observable
class Juego {
	
	static final Juego instance = new Juego()
	
	//String admin 
	Collection<Laberinto> laberintos = new ArrayList<Laberinto>
	
	
	new(){
		//this.admin = nombreadmin
		
		this.addLaberinto("Laberinto 1", "MacGyverInt", "Habitacion del Mal", "Ir a escalera", "Lentes", "Pila AA")
		this.addLaberinto("Laberinto 2", "Date un respiro", "Habitacion para novatos", "Caminar a la derecha", "Escalera", "Largavista")
		this.addLaberinto("Laberinto 3", "El tiempo es oro", "Habitacion dorada", "Saltar la pared", "Bomba", "Pizza")
		this.addLaberinto("Laberinto 4", "Aprobando la materia", "Habitacion Tenes un 7", "Aprobar", "Angular", "CSS")
	}
	
	def static Juego getInstance(){
		
		return instance
	}	
	
	def void addLaberinto(String nombreLaberinto, String descripcion, String nombreHabitacion, String accion, String item, String itemDos){
		laberintos.add(new Laberinto(nombreLaberinto, descripcion, nombreHabitacion, accion, item, itemDos))
	}
	
	
	}
	