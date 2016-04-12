package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Item {
	String nombre

	// que comportamiento tiene un item??
	new (String comoSeLlama){
		super()// usar el new de la clase padre
		this.nombre = comoSeLlama //inicializar mi variable
	}
	
	
}
