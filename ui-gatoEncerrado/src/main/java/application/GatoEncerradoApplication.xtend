package application

import org.uqbar.arena.Application
import windows.PantallaInicialAdmin
import org.uqbar.gatoEncerrado.Juego

class GatoEncerradoApplication extends Application{
	
	override protected createMainWindow() {
		new PantallaInicialAdmin(this, new Juego("Pablo"))
	}
	
	def static void main(String[] args) {
		new GatoEncerradoApplication().start
	}
}