package windows

import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.gatoEncerrado.appModels.AgregarLaberintoAppModel
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner

class AgregarLaberintoWindow extends SimpleWindow<AgregarLaberintoAppModel> {
	
	new(WindowOwner parent, AgregarLaberintoAppModel model) {
		super(parent, model)
	}
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}