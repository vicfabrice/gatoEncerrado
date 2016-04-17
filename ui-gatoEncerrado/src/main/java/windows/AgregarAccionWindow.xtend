package windows

import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.gatoEncerrado.AccionAgarrar
import org.uqbar.gatoEncerrado.AccionUsar

class AgregarAccionWindow extends SimpleWindow<PantallaInicialAdmin> {
	
	new(WindowOwner parent, PantallaInicialAdmin model) {
		super(parent, model)
	}
	
	override createMainTemplate(Panel mainPanel) {
		this.title = "Agregar Accion"

		mainPanel.layout = new VerticalLayout
		// Agregamos el titulo
		
		new Label(mainPanel).text = "selecciona una accion a agregar"
		
		//los botones van dispuestos en forma horizontal
		val Panel panelTresBotones = new Panel(mainPanel)
		panelTresBotones.layout = new HorizontalLayout
		
		new Button(panelTresBotones) => [
			caption = "Agregar Accion de Ir a Otra Habitacion"
//			onClick [|new AgregarAccionHabitacionWindow(this, this.modelObject.laberinto).open]
		]
		new Button(panelTresBotones) => [
			caption = "Agregar Accion de Agarrar un Elemento"
			val accion2 = new AccionAgarrar()
			onClick [|new AccionAgarrarWindow(this, accion2).open]
		]
		new Button(panelTresBotones) => [
			caption = "Agregar Accion de Usar un Elemento"
			val accion3 = new AccionUsar()
			onClick [|new AccionUsarWindow(this, accion3).open]
		]
		
	} 
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}