package org.uqbar.gatoEncerrado;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.gatoEncerrado.Habitacion;
import org.uqbar.gatoEncerrado.Laberinto;

@Accessors
@SuppressWarnings("all")
public class Participante {
  private Laberinto laberintoActual;
  
  private Habitacion habitacionActual;
  
  private ArrayList<Laberinto> laberintosSuperados;
  
  private ArrayList<Laberinto> laberintosAbandonados;
  
  private ArrayList<String> inventario;
  
  public void elegirLaberinto(final List<Laberinto> laberintos, final Laberinto jugarEste) {
    for (final Laberinto lab : laberintos) {
      String _nombreLaberinto = lab.getNombreLaberinto();
      String _nombreLaberinto_1 = jugarEste.getNombreLaberinto();
      boolean _contains = _nombreLaberinto.contains(_nombreLaberinto_1);
      if (_contains) {
        this.laberintoActual = jugarEste;
        Habitacion _habitacionInicial = jugarEste.getHabitacionInicial();
        this.habitacionActual = _habitacionInicial;
      }
    }
  }
  
  public void agregarItemAlInventario(final String item) {
    int _size = this.inventario.size();
    boolean _lessThan = (_size < 15);
    if (_lessThan) {
      this.inventario.add(item);
    }
  }
  
  public void usarItem(final String item) {
    ArrayList<String> aRecorrer = this.habitacionActual.getItemsPermitidos();
    for (final String s : aRecorrer) {
      boolean _contains = aRecorrer.contains(item);
      if (_contains) {
        this.inventario.remove(item);
      } else {
        throw new UserException("no se puede realizar action");
      }
    }
  }
  
  public Object verInventario() {
    return null;
  }
  
  public Object verLaberintosSuperados() {
    return null;
  }
  
  public Object verLaberintosAbandonados() {
    return null;
  }
  
  public boolean abandonarJuego() {
    return this.laberintosAbandonados.add(this.laberintoActual);
  }
  
  public boolean salirDelLaberinto() {
    boolean _xifexpression = false;
    Boolean _esFinal = this.habitacionActual.getEsFinal();
    boolean _equals = ((_esFinal).booleanValue() == true);
    if (_equals) {
      _xifexpression = this.laberintosSuperados.add(this.laberintoActual);
    }
    return _xifexpression;
  }
  
  @Pure
  public Laberinto getLaberintoActual() {
    return this.laberintoActual;
  }
  
  public void setLaberintoActual(final Laberinto laberintoActual) {
    this.laberintoActual = laberintoActual;
  }
  
  @Pure
  public Habitacion getHabitacionActual() {
    return this.habitacionActual;
  }
  
  public void setHabitacionActual(final Habitacion habitacionActual) {
    this.habitacionActual = habitacionActual;
  }
  
  @Pure
  public ArrayList<Laberinto> getLaberintosSuperados() {
    return this.laberintosSuperados;
  }
  
  public void setLaberintosSuperados(final ArrayList<Laberinto> laberintosSuperados) {
    this.laberintosSuperados = laberintosSuperados;
  }
  
  @Pure
  public ArrayList<Laberinto> getLaberintosAbandonados() {
    return this.laberintosAbandonados;
  }
  
  public void setLaberintosAbandonados(final ArrayList<Laberinto> laberintosAbandonados) {
    this.laberintosAbandonados = laberintosAbandonados;
  }
  
  @Pure
  public ArrayList<String> getInventario() {
    return this.inventario;
  }
  
  public void setInventario(final ArrayList<String> inventario) {
    this.inventario = inventario;
  }
}
