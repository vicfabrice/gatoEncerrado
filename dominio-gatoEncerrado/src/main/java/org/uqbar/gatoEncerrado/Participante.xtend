
package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList
import java.lang.Exception import org.uqbar.commons.model.UserException

@Accessors 
class Participante {
	
	 
	Laberinto laberintoActual
	Habitacion habitacionActual
	ArrayList<Laberinto> laberintosSuperados
	ArrayList<Laberinto> laberintosAbandonados
	ArrayList <String> inventario
	
	def void elegirLaberinto(List<Laberinto> laberintos, Laberinto jugarEste){
		
		for (Laberinto lab : laberintos){
			if (lab.nombreLaberinto.contains(jugarEste.nombreLaberinto)){
					this.laberintoActual = jugarEste
					this.habitacionActual = jugarEste.habitacionInicial
			}
		}
		
	}
	
	
	def void agregarItemAlInventario(String item){
		if (this.inventario.size < 15){
			inventario.add(item)
		} // debería tirar una excepción si ya son 15
		
	}
	
	def void usarItem(String item){
		
		var ArrayList<String> aRecorrer= this.habitacionActual.itemsPermitidos
		for (String s : aRecorrer){
			if (aRecorrer.contains(item)){
					this.inventario.remove(item)
			}else (throw new UserException("no se puede realizar action"))
		}
	}
	
	def verInventario(){}
	def verLaberintosSuperados(){}
	def verLaberintosAbandonados(){}
	
	
	
	def abandonarJuego(){
		
		laberintosAbandonados.add(laberintoActual)
	}
	
	def salirDelLaberinto(){
		
		if (habitacionActual.esFinal == true){
			laberintosSuperados.add(laberintoActual)
		}  
		
	}
}