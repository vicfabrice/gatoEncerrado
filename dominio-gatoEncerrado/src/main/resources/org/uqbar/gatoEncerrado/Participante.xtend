package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors


@Accessors 
class Participante {
	
	Item[]inventario = newItemArrayOfSize(15)
	List<Laberinto> labertintosSuperados
	List<Laberinto> laberintosAbandonados
	
	def elegirLaberinto(){}
	
	def verInventario(){}
	
	def usarItem(){}
	
	def abandonarJuego(){}
}