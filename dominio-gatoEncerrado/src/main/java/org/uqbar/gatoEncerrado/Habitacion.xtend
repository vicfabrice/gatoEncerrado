package org.uqbar.gatoEncerrado
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors
class Habitacion {
	
	String nombreHabitacion
	Integer idHabitacion
	ArrayList<String> acciones
	Integer idAccion
		
	new(Integer unInteger, String unNombre,String unaAccion) {
		this.idHabitacion = unInteger
		this.nombreHabitacion= unNombre
		this.addAcciones(unaAccion)
		this.idAccion = 1
	}
	
	def addAcciones(String unString) {
		val accionNueva = new Accion(idAccion,unString)
		idAccion = idAccion +20
	}
	
	def getNombre() {
		return this.nombreHabitacion
	}
	
}