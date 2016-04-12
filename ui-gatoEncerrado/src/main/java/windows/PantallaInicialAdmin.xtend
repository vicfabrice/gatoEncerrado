package windows

import org.uqbar.arena.bindings.PropertyAdapter
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.gatoEncerrado.Habitacion
import org.uqbar.gatoEncerrado.Juego
import org.uqbar.gatoEncerrado.Laberinto
import org.uqbar.gatoEncerrado.appModels.JuegoAppModel
import org.uqbar.arena.widgets.CheckBox

class PantallaInicialAdmin extends SimpleWindow<JuegoAppModel> {

	new(WindowOwner parent, Juego model) {
		super(parent, new JuegoAppModel(model))
	}

	override createMainTemplate(Panel mainPanel) {
		this.title = "Acá hay gato encerrado"

		mainPanel.layout = new VerticalLayout
		// Agregamos el titulo
		new Label(mainPanel) => [
			text = "Acá hay gato encerrado"
			fontSize = 25
		]

//		new Label(mainPanel) => [
//			new LabeledTextBox(mainPanel) => [
//			text = "hola:"
//			width = 250
//			bindValueToProperty("nombre") 
//			fontSize = 15
//		]
		// Agregamos el contenido
		val Panel contentPanel = new Panel(mainPanel)
		contentPanel.layout = new ColumnLayout(3)
		this.crearListadoDeLaberintos(contentPanel)
		this.crearListadoDeHabitaciones(contentPanel)
		this.crearDescripcionDeHabitaciones(contentPanel)
	}

	def crearListadoDeLaberintos(Panel owner) {
		val Panel panelDeLaberintos = new Panel(owner)
		panelDeLaberintos.layout = new VerticalLayout

		new Label(panelDeLaberintos).text = "Laberintos"
		new List<Laberinto>(panelDeLaberintos) => [
			bindItemsToProperty("laberintos").adapter = new PropertyAdapter(Laberinto, "nombreLaberinto")
			height = 150
			width = 130
			bindValueToProperty("laberintoSeleccionado")
		]
		new Button(panelDeLaberintos) => [
			caption = "Agregar Laberinto"
//			onClick [|new AgregarLaberintoWindow(this, this.modelObject.laberinto).open]
		]
		new Button(panelDeLaberintos) => [
			caption = "Quitar Habitacion"
//			onClick [|new QuitarLaberintoWindow(this, this.modelObject.laberinto).open]
		]
	}

	def crearListadoDeHabitaciones(Panel owner) {

		val Panel panelDeHabitaciones = new Panel(owner)
		panelDeHabitaciones.layout = new VerticalLayout
		new Label(panelDeHabitaciones) => [
			new Label(panelDeHabitaciones).text = "Habitaciones"
		]
		new List<Laberinto>(panelDeHabitaciones) => [
			bindItemsToProperty("laberintoSeleccionado.habitaciones").adapter = new PropertyAdapter(Habitacion, "nombreHabitacion")
			height = 150
			width = 130
			bindValueToProperty("habitacionSeleccionada")
		]
		new Button(panelDeHabitaciones) => [
			caption = "Agregar Habitacion"
//				onClick [ | new AgregarLaberintoWindow(this, this.modelObject.laberinto).open ]
		]
		new Button(panelDeHabitaciones) => [
			caption = "Quitar Laberinto"
//				onClick [ | new QuitarLaberintoWindow(this, this.modelObject.laberinto).open ]
		]
		
		
	}
	
	def crearDescripcionDeHabitaciones(Panel owner) {
		val Panel panelDeDescripciones = new Panel(owner)
		panelDeDescripciones.layout = new VerticalLayout
		
		new Label(panelDeDescripciones) => [
			new Label(panelDeDescripciones).text = "Habitacion seleccionada:"
			bindValueToProperty("laberintoSeleccionado.habitaciones").adapter = new PropertyAdapter(Habitacion, "nombreHabitacion")
		]
		new Label(panelDeDescripciones).text = "es inicial?"
		new CheckBox(panelDeDescripciones) => [
			bindValueToProperty("habitacion.esInicial").adapter = new PropertyAdapter (Habitacion, "esInicial")
		]
		}
	
	

	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
