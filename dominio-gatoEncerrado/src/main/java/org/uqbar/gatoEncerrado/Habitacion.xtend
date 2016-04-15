package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

@Accessors
class Habitacion {
	
	String nombreHabitacion
	List<String> items
	List<String> itemsPermitidos
	Boolean esInicial
	Boolean esFinal
	
	/*una habitacion puede ser inicial y final en un mismo laberinto
	 * por ejemplo: laberinto: "Cursar Programacion UI"
	 * habitacion: "Aula 60"
	 */
	
	def crearHabitacion(String unNombre){
		this.nombreHabitacion = unNombre
		this.esInicial = false
		this.esFinal = false
	}
	
	def marcarInicial(){
		this.esInicial = true
	}
	
	def marcarFinal(){
		this.esFinal = true
	}
	
	def desmarcarInicial(){
		this.esInicial = false
	}
	
	def desmarcarFinal(){
		this.esFinal = false
	}
	
	def usarItem(){}
		
	def agarrarItem(){}
	
	def salirDeLaberinto(){
		
	}
}