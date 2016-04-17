package windows

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.TextBox
import org.uqbar.gatoEncerrado.AccionAgarrar
import org.uqbar.arena.windows.Dialog

class AccionAgarrarWindow extends Dialog<AccionAgarrar> {
	
	new(WindowOwner owner, AccionAgarrar model) {
		super(owner, model)
	}
	
	override createMainTemplate(Panel mainPanel) {
		this.title = "Accion de Agarrar un Elemento"

		mainPanel.layout = new VerticalLayout
		// Agregamos el titulo
		
		new Label(mainPanel).text = "escriba el elemento que aparecera en la habitacion"
		
		new TextBox (mainPanel)=>[
			bindValueToProperty ("elemento")
			width = 200
		]
		
		//los botones van dispuestos en forma horizontal
		val Panel panelDosBotones = new Panel(mainPanel)
		panelDosBotones.layout = new HorizontalLayout
		
		new Button(panelDosBotones) => [
			caption = "cancelar"
			onClick [|this.close]
		]
		new Button(panelDosBotones) => [
			caption = "Agregar"
			onClick [|this.close]//editar
		]
		
	} 
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}