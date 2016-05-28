package org.uqbar.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Accion{
	
	Integer idAccion
	String nombreAccion
	
	new (){
		super()
	}
	
	new(Integer integer, String string) {
		
		this.idAccion = integer
		this.nombreAccion = string
		
	}
	
}