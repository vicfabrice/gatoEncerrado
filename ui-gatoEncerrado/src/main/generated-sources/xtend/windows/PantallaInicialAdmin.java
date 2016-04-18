package windows;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.gatoEncerrado.Habitacion;
import org.uqbar.gatoEncerrado.Juego;
import org.uqbar.gatoEncerrado.Laberinto;
import org.uqbar.gatoEncerrado.appModels.JuegoAppModel;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;

@SuppressWarnings("all")
public class PantallaInicialAdmin extends SimpleWindow<JuegoAppModel> {
  public PantallaInicialAdmin(final WindowOwner parent, final Juego model) {
    super(parent, new JuegoAppModel(model));
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    this.setTitle("Acá hay gato encerrado");
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Acá hay gato encerrado");
        it.setFontSize(25);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(mainPanel);
    _label_1.setText("hola:");
    Label _label_2 = new Label(mainPanel);
    _label_2.<Object, ControlBuilder>bindValueToProperty("admin");
    final Panel contentPanel = new Panel(mainPanel);
    ColumnLayout _columnLayout = new ColumnLayout(3);
    contentPanel.setLayout(_columnLayout);
    this.crearListadoDeLaberintos(contentPanel);
    this.crearListadoDeHabitaciones(contentPanel);
    this.crearDescripcionDeHabitaciones(contentPanel);
  }
  
  public Button crearListadoDeLaberintos(final Panel owner) {
    Button _xblockexpression = null;
    {
      final Panel panelDeLaberintos = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      panelDeLaberintos.setLayout(_verticalLayout);
      Label _label = new Label(panelDeLaberintos);
      _label.setText("Laberintos");
      List<Laberinto> _list = new List<Laberinto>(panelDeLaberintos);
      final Procedure1<List<Laberinto>> _function = new Procedure1<List<Laberinto>>() {
        public void apply(final List<Laberinto> it) {
          Binding<?, Selector<Laberinto>, ListBuilder<Laberinto>> _bindItemsToProperty = it.bindItemsToProperty("laberintos");
          PropertyAdapter _propertyAdapter = new PropertyAdapter(Laberinto.class, "nombreLaberinto");
          _bindItemsToProperty.setAdapter(_propertyAdapter);
          it.setHeight(150);
          it.setWidth(130);
          it.<Object, ControlBuilder>bindValueToProperty("laberintoSeleccionado");
        }
      };
      ObjectExtensions.<List<Laberinto>>operator_doubleArrow(_list, _function);
      Button _button = new Button(panelDeLaberintos);
      final Procedure1<Button> _function_1 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Agregar Laberinto");
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
      Button _button_1 = new Button(panelDeLaberintos);
      final Procedure1<Button> _function_2 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Quitar Habitacion");
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
    }
    return _xblockexpression;
  }
  
  public Button crearListadoDeHabitaciones(final Panel owner) {
    Button _xblockexpression = null;
    {
      final Panel panelDeHabitaciones = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      panelDeHabitaciones.setLayout(_verticalLayout);
      Label _label = new Label(panelDeHabitaciones);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          Label _label = new Label(panelDeHabitaciones);
          _label.setText("Habitaciones");
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
      List<Laberinto> _list = new List<Laberinto>(panelDeHabitaciones);
      final Procedure1<List<Laberinto>> _function_1 = new Procedure1<List<Laberinto>>() {
        public void apply(final List<Laberinto> it) {
          Binding<?, Selector<Laberinto>, ListBuilder<Laberinto>> _bindItemsToProperty = it.bindItemsToProperty("laberintoSeleccionado.habitaciones");
          PropertyAdapter _propertyAdapter = new PropertyAdapter(Habitacion.class, "nombreHabitacion");
          _bindItemsToProperty.setAdapter(_propertyAdapter);
          it.setHeight(150);
          it.setWidth(130);
          it.<Object, ControlBuilder>bindValueToProperty("habitacionSeleccionada");
        }
      };
      ObjectExtensions.<List<Laberinto>>operator_doubleArrow(_list, _function_1);
      Button _button = new Button(panelDeHabitaciones);
      final Procedure1<Button> _function_2 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Agregar Habitacion");
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
      Button _button_1 = new Button(panelDeHabitaciones);
      final Procedure1<Button> _function_3 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Quitar Laberinto");
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
    }
    return _xblockexpression;
  }
  
  public CheckBox crearDescripcionDeHabitaciones(final Panel owner) {
    CheckBox _xblockexpression = null;
    {
      final Panel panelDeDescripciones = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      panelDeDescripciones.setLayout(_verticalLayout);
      Label _label = new Label(panelDeDescripciones);
      _label.setText("Habitacion Seleccionada:");
      Label _label_1 = new Label(panelDeDescripciones);
      _label_1.<Object, ControlBuilder>bindValueToProperty("nombreHabitacion");
      Label _label_2 = new Label(panelDeDescripciones);
      _label_2.setText("Es Inicial?");
      CheckBox _checkBox = new CheckBox(panelDeDescripciones);
      final Procedure1<CheckBox> _function = new Procedure1<CheckBox>() {
        public void apply(final CheckBox it) {
          it.<Object, ControlBuilder>bindValueToProperty("habitacionSeleccionada.esInicial");
        }
      };
      ObjectExtensions.<CheckBox>operator_doubleArrow(_checkBox, _function);
      Label _label_3 = new Label(panelDeDescripciones);
      _label_3.setText("Es Final?");
      CheckBox _checkBox_1 = new CheckBox(panelDeDescripciones);
      final Procedure1<CheckBox> _function_1 = new Procedure1<CheckBox>() {
        public void apply(final CheckBox it) {
          it.<Object, ControlBuilder>bindValueToProperty("habitacionSeleccionada.esFinal");
          Label _label = new Label(panelDeDescripciones);
          _label.setText("Acciones");
          List<Object> _list = new List<Object>(panelDeDescripciones);
          final Procedure1<List<Object>> _function = new Procedure1<List<Object>>() {
            public void apply(final List<Object> it) {
              it.bindItemsToProperty("habitacionSeleccionada.acciones");
              it.<Object, ControlBuilder>bindValueToProperty("accionSeleccionada");
              it.setWidth(220);
              it.setHeight(220);
            }
          };
          ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function);
          Button _button = new Button(panelDeDescripciones);
          final Procedure1<Button> _function_1 = new Procedure1<Button>() {
            public void apply(final Button it) {
              it.setCaption("Agregar accion");
              it.setAsDefault();
            }
          };
          ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
          Button _button_1 = new Button(panelDeDescripciones);
          final Procedure1<Button> _function_2 = new Procedure1<Button>() {
            public void apply(final Button it) {
              it.setCaption("Quitar accion");
              it.setAsDefault();
            }
          };
          ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
        }
      };
      _xblockexpression = ObjectExtensions.<CheckBox>operator_doubleArrow(_checkBox_1, _function_1);
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
