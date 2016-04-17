package org.uqbar.gatoEncerrado

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class AccionUsar extends Accion {
	String item
	String accion
	// usaria un diccionario?
	
	new(){
		super()
	}


	new (String elem, String acc){
		item = elem
		accion = acc
	}
}