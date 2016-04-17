package windows

import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Selector
import org.uqbar.gatoEncerrado.Inventario
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.gatoEncerrado.AccionUsar
import org.uqbar.arena.windows.Dialog

class AccionUsarWindow extends Dialog<AccionUsar> {
	
	new(WindowOwner parent, AccionUsar model) {
		super(parent, model)
	}
	
	override createMainTemplate(Panel mainPanel) {
		this.title = "Agregar Accion de Usar"

		mainPanel.layout = new VerticalLayout
		
		// lo divido en tres
		val Panel contentPanel = new Panel(mainPanel)
		contentPanel.layout = new ColumnLayout(3)
		this.seleccionarLaAccion(contentPanel)
		this.crearLaAccion(contentPanel)
		this.confirmar(contentPanel)
	}
	
	def seleccionarLaAccion(Panel owner) {
		owner.layout = new VerticalLayout
		new Label(owner).text = "seleccione el elemento que pueda ser usado"
		new Selector<Inventario>(owner)=> [ //ver!
			allowNull(false)
			bindValueToProperty("items")
		]
	}
	
	def crearLaAccion(Panel owner) {
		owner.layout = new VerticalLayout
		new Label(owner).text = "cree la accion a realizar"
		new Button(owner) => [
			caption = "Agregar Accion"
//			onClick [|new AgregarAccionHabitacionWindow(this, this.modelObject.laberinto).open]
		]
	}		
	
	def confirmar(Panel owner) {
		owner.layout = new HorizontalLayout
		new Button(owner) => [
			caption = "Cancelar"
			onClick [|this.close]
		]
		new Button(owner) => [
			caption = "Agregar"
//			onClick [|new UsarElementoHabitacionWindow(this, this.modelObject.laberinto).open]
		]
		
	}
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
		
		
		
		

	
}