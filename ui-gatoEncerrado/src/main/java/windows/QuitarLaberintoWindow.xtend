package windows
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.gatoEncerrado.Laberinto
import org.uqbar.gatoEncerrado.appModels.QuitarLaberintoAppModel

class QuitarLaberintoWindow extends Dialog<QuitarLaberintoAppModel> {
	
	new(WindowOwner owner, Laberinto model) {
		super(owner, new QuitarLaberintoAppModel(model))
	}
	
	override protected createFormPanel(Panel mainPanel) {
		title = "quitar laberinto"
		mainPanel.layout = new VerticalLayout 
		
		
		new Button(mainPanel)=>[
			caption = "Aceptar"
			onClick [ |
				this.modelObject.eliminarLaberinto
				this.close
			]
		]
	}
	}