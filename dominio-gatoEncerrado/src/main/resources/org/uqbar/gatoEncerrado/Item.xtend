package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors

@Accesors
class Item {
	String nombre
	// que comportamiento tiene un item??
	def new (String comoSeLlama){
		super()// usar el new de la clase padre
		this.nombre = comoSellama //inicializar mi variable
	}
}
	
}