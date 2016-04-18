package org.uqbar.gatoEncerrado;

import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.gatoEncerrado.Habitacion;

@Accessors
@SuppressWarnings("all")
public class Laberinto {
  private String nombreLaberinto;
  
  private ArrayList<Habitacion> habitaciones;
  
  private Habitacion habitacionInicial;
  
  private Habitacion habitacionFinal;
  
  public ArrayList<Habitacion> crear(final ArrayList<Habitacion> habs) {
    return this.habitaciones = habs;
  }
  
  public ArrayList<Habitacion> crear() {
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    return this.habitaciones = _newArrayList;
  }
  
  public boolean agregarHabitacion(final Habitacion nueva) {
    return this.habitaciones.add(nueva);
  }
  
  public void definirHabitacionComoInicial(final Habitacion start) {
    this.habitacionInicial = start;
    start.setEsInicial(Boolean.valueOf(true));
  }
  
  public Boolean definirHabitacionComoFinal(final Habitacion finish) {
    Boolean _xblockexpression = null;
    {
      this.habitacionFinal = finish;
      _xblockexpression = finish.marcarFinal();
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getNombreLaberinto() {
    return this.nombreLaberinto;
  }
  
  public void setNombreLaberinto(final String nombreLaberinto) {
    this.nombreLaberinto = nombreLaberinto;
  }
  
  @Pure
  public ArrayList<Habitacion> getHabitaciones() {
    return this.habitaciones;
  }
  
  public void setHabitaciones(final ArrayList<Habitacion> habitaciones) {
    this.habitaciones = habitaciones;
  }
  
  @Pure
  public Habitacion getHabitacionInicial() {
    return this.habitacionInicial;
  }
  
  public void setHabitacionInicial(final Habitacion habitacionInicial) {
    this.habitacionInicial = habitacionInicial;
  }
  
  @Pure
  public Habitacion getHabitacionFinal() {
    return this.habitacionFinal;
  }
  
  public void setHabitacionFinal(final Habitacion habitacionFinal) {
    this.habitacionFinal = habitacionFinal;
  }
}
