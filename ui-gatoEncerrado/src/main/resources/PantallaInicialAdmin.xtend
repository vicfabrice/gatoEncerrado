
package org.uqbar.gatoEncerrado
import org.uqbar.arena.windows.SimpleWindow

class AdminGatoEncerrado extends SimpleWindow<Admin> {
	
	new (WindowOwner owner, Admin admin){
		super(owner, admin)
		title "Acá hay gato encerrado"
		taskDescription = "Configuración"
	}
	
	override createFormPanel (Panel mainPanel){
		val editorPanel = new Panel(mainPanel)
		editorPanel.layout = new ColumnLayout(3)
		
		
		
	}
	
	
}

/*
 * override protected createFormPanel(Panel mainPanel) {
		title = "Nueva Materia"
		mainPanel.layout = new VerticalLayout 
		
		new Label(mainPanel).text = "Nombre:"
		new TextBox(mainPanel) => [
			value <=> "materia.nombreMateria"
			width = 200
		]
		new Button(mainPanel)=>[
			caption = "Aceptar"
			onClick [ |
				this.modelObject.agregarMateria
				this.close
			]
		]
	}
 */



/*
	new(WindowOwner owner, Apuesta apuesta) {
		super(owner, apuesta)
		title = "Ruleta"
		taskDescription = "Hagan sus apuestas!!!"
	}

	override createFormPanel(Panel mainPanel) {
		val editorPanel = new Panel(mainPanel)
		editorPanel.layout = new ColumnLayout(2)
		
		new Label(editorPanel).text = "Fecha (posterior a la de hoy)"
		
		new DateBox(editorPanel) => [
			width = 110
			(value <=> "fecha").transformer = new DateTransformer
		]
		
		new Label(editorPanel).text = "Monto"
		
		new NumericField(editorPanel) => [
			value <=> "monto"
		]

		new Label(editorPanel).text = "Tipo de Apuesta"
		new Selector(editorPanel) => [
			allowNull = false
			items <=> "tiposPosibles"
			value <=> "tipo"
		]

		new Label(editorPanel).text = "¿A qué querés apostar?"
		new Selector(editorPanel) => [
			allowNull = false
			width = 100
			items <=> "tipo.valoresPosibles"
			value <=> "valorApostado"			
		]
	}

	override addActions(Panel actionsPanel) {
		new Button(actionsPanel) => [
			caption = "Jugar"
			setAsDefault
			onClick [ | jugar ]
	
			// bindEnabled(new NotNullObservable("valorApostado"))
			bindEnabledToProperty("puedeJugar")
			disableOnError
			// Ojo, al hacer esto estamos saliendo del binding
			// 1 a 1 entre modelo y vista. El disableOnError
			// pisa la definición anterior del binding entre la propiedad
			// enabled del botón y la propiedad puedeJugar del modelo
		]

		new Label(actionsPanel) => [
			width = 150
			value <=> "resultado"
		]
	}

	def jugar() {
		modelObject.jugar
		showInfo(modelObject.resultado.toString)
	}

}

class DateBox extends TextBox {
	new(Panel container) {
		super(container)
	}

	override bindValueToProperty(String propertyName) {
		val binding = super.bindValueToProperty(propertyName)
		this.withFilter(new DateTextFilter)
		binding
	}
	* 
	*  */
	*/