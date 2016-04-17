package org.uqbar.gatoEncerrado;

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class AccionAgarrar extends Accion {
	String elemento
	
	new(){
		super()
	}
	
	new (String algo){
		elemento = algo
	}
}