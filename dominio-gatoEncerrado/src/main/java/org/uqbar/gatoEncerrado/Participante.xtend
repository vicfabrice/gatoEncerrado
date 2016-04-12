 package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

@Accessors 
class Participante {
	
	List <Item> inventario 
	List<Laberinto> laberintosAbandonados
	Laberinto laberintoActual
	Habitacion habitacionActual
	List<Laberinto> laberintosSuperados
	
	def elegirLaberinto(){}
	
	def agregarItemAlInventario(Item item){
		
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