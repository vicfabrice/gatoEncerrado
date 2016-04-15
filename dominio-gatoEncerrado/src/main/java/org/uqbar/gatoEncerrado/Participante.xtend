
package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors 
class Participante {
	
	 
	Laberinto laberintoActual
	Habitacion habitacionActual
	List<Laberinto> laberintosSuperados
	List<Laberinto> laberintosAbandonados
	List <String> inventario
	
	def void elegirLaberinto(List<Laberinto> laberintos, Laberinto jugarEste){
		
		for (Laberinto lab : laberintos){
			if (lab.nombreLaberinto.contains(jugarEste.nombreLaberinto)){
					this.laberintoActual = jugarEste
			}
		}
		
	}
	
	def agregarItemAlInventario(String item){
		
		inventario.add(item)
		
	}
	def verInventario(){}
	
	def usarItem(){}
	
	def abandonarJuego(){
		
		laberintosAbandonados.add(laberintoActual)
	}
	
	def salirDelLaberinto(){
		
		if (habitacionActual.esFinal == true){
			laberintosSuperados.add(laberintoActual)
		}  
		
	}
}