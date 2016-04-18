package org.uqbar.gatoEncerrado;

import org.uqbar.gatoEncerrado.Accion;
import org.uqbar.gatoEncerrado.Habitacion;

@SuppressWarnings("all")
public class AccionIrAHabitacion extends Accion {
  private Habitacion destino;
  
  public AccionIrAHabitacion() {
    super();
  }
  
  public AccionIrAHabitacion(final Habitacion lugar) {
    this.destino = lugar;
  }
}
