package windows;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.gatoEncerrado.AccionAgarrar;
import org.uqbar.gatoEncerrado.AccionUsar;
import org.uqbar.lacar.ui.model.Action;
import windows.AccionAgarrarWindow;
import windows.AccionUsarWindow;
import windows.PantallaInicialAdmin;

@SuppressWarnings("all")
public class AgregarAccionWindow extends SimpleWindow<PantallaInicialAdmin> {
  public AgregarAccionWindow(final WindowOwner parent, final PantallaInicialAdmin model) {
    super(parent, model);
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    this.setTitle("Agregar Accion");
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Label _label = new Label(mainPanel);
    _label.setText("selecciona una accion a agregar");
    final Panel panelTresBotones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelTresBotones.setLayout(_horizontalLayout);
    Button _button = new Button(panelTresBotones);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar Accion de Ir a Otra Habitacion");
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    Button _button_1 = new Button(panelTresBotones);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar Accion de Agarrar un Elemento");
        final AccionAgarrar accion2 = new AccionAgarrar();
        final Action _function = new Action() {
          public void execute() {
            AccionAgarrarWindow _accionAgarrarWindow = new AccionAgarrarWindow(AgregarAccionWindow.this, accion2);
            _accionAgarrarWindow.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_1);
    Button _button_2 = new Button(panelTresBotones);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar Accion de Usar un Elemento");
        final AccionUsar accion3 = new AccionUsar();
        final Action _function = new Action() {
          public void execute() {
            AccionUsarWindow _accionUsarWindow = new AccionUsarWindow(AgregarAccionWindow.this, accion3);
            _accionUsarWindow.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_2);
  }
  
  protected void addActions(final Panel actionsPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
