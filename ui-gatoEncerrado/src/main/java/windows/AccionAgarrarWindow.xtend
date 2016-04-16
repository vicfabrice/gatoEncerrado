package windows

import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.gatoEncerrado.appModels.AccionAgarrarAppModel
import org.uqbar.arena.widgets.TextBox

class AccionAgarrarWindow extends SimpleWindow<AccionAgarrarAppModel> {
	
	new(WindowOwner parent, AccionAgarrarAppModel model) {
		super(parent, model)
	}
	
	override createMainTemplate(Panel mainPanel) {
		this.title = "Accion de Agarrar un Elemento"

		mainPanel.layout = new VerticalLayout
		// Agregamos el titulo
		
		new Label(mainPanel).text = "escriba el elemento que aparecera en la habitacion"
		
		new TextBox (mainPanel)=>[
			bindValueToProperty ("elementoNuevo")
			width = 200
		]
		
		//los botones van dispuestos en forma horizontal
		val Panel panelDosBotones = new Panel(mainPanel)
		panelDosBotones.layout = new HorizontalLayout
		
		new Button(panelDosBotones) => [
			caption = "cancelar"
//			onClick [|new AgregarAccionHabitacionWindow(this, this.modelObject.laberinto).open]
		]
		new Button(panelDosBotones) => [
			caption = "Agregar"
//			onClick [|new AgarraElementoHabitacionWindow(this, this.modelObject.laberinto).open]
		]
		
	} 
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}