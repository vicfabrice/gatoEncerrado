package org.uqbar.gatoEncerrado

@Accessors 
class Participante {
	
	val Item[]inventario = newItemArrayOfSize(15)
	val List<Laberinto> labertintosSuperados
	val List<Laberinto> laberintosAbandonados
	
	def elegirLaberinto(){}
	
	def verInventario(){}
	
	def usarItem(){}
	
	def abandonarJuego(){}
}