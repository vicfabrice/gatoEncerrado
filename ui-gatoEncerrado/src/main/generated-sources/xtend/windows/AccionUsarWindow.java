package windows;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.gatoEncerrado.AccionUsar;
import org.uqbar.gatoEncerrado.Habitacion;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class AccionUsarWindow extends Dialog<AccionUsar> {
  public AccionUsarWindow(final WindowOwner parent, final AccionUsar model) {
    super(parent, model);
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    this.setTitle("Agregar Accion de Usar");
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    final Panel contentPanel = new Panel(mainPanel);
    ColumnLayout _columnLayout = new ColumnLayout(3);
    contentPanel.setLayout(_columnLayout);
    this.seleccionarLaAccion(contentPanel);
    this.crearLaAccion(contentPanel);
    this.confirmar(contentPanel);
  }
  
  public Selector<Habitacion> seleccionarLaAccion(final Panel owner) {
    Selector<Habitacion> _xblockexpression = null;
    {
      VerticalLayout _verticalLayout = new VerticalLayout();
      owner.setLayout(_verticalLayout);
      Label _label = new Label(owner);
      _label.setText("seleccione el elemento que pueda ser usado");
      Selector<Habitacion> _selector = new Selector<Habitacion>(owner);
      final Procedure1<Selector<Habitacion>> _function = new Procedure1<Selector<Habitacion>>() {
        public void apply(final Selector<Habitacion> it) {
          it.allowNull(false);
          it.<Object, ControlBuilder>bindValueToProperty("items");
        }
      };
      _xblockexpression = ObjectExtensions.<Selector<Habitacion>>operator_doubleArrow(_selector, _function);
    }
    return _xblockexpression;
  }
  
  public Button crearLaAccion(final Panel owner) {
    Button _xblockexpression = null;
    {
      VerticalLayout _verticalLayout = new VerticalLayout();
      owner.setLayout(_verticalLayout);
      Label _label = new Label(owner);
      _label.setText("cree la accion a realizar");
      Button _button = new Button(owner);
      final Procedure1<Button> _function = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Agregar Accion");
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    }
    return _xblockexpression;
  }
  
  public Button confirmar(final Panel owner) {
    Button _xblockexpression = null;
    {
      HorizontalLayout _horizontalLayout = new HorizontalLayout();
      owner.setLayout(_horizontalLayout);
      Button _button = new Button(owner);
      final Procedure1<Button> _function = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Cancelar");
          final Action _function = new Action() {
            public void execute() {
              AccionUsarWindow.this.close();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
      Button _button_1 = new Button(owner);
      final Procedure1<Button> _function_1 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Agregar");
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_1);
    }
    return _xblockexpression;
  }
  
  protected void addActions(final Panel actionsPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
