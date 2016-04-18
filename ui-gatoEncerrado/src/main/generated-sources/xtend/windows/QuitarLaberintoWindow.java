package windows;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.gatoEncerrado.Laberinto;
import org.uqbar.gatoEncerrado.appModels.QuitarLaberintoAppModel;
import org.uqbar.lacar.ui.model.Action;

@SuppressWarnings("all")
public class QuitarLaberintoWindow extends Dialog<QuitarLaberintoAppModel> {
  public QuitarLaberintoWindow(final WindowOwner owner, final Laberinto model) {
    super(owner, new QuitarLaberintoAppModel(model));
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.setTitle("quitar laberinto");
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            QuitarLaberintoAppModel _modelObject = QuitarLaberintoWindow.this.getModelObject();
            _modelObject.eliminarLaberinto();
            QuitarLaberintoWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
  }
}
