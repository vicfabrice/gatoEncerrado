package org.uqbar.gatoEncerrado;

import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.gatoEncerrado.Accion;

@Accessors
@SuppressWarnings("all")
public class Habitacion {
  private String nombreHabitacion;
  
  private ArrayList<String> items;
  
  private ArrayList<String> itemsPermitidos;
  
  private Boolean esInicial;
  
  private Boolean esFinal;
  
  private ArrayList<Accion> acciones;
  
  /**
   * una habitacion puede ser inicial y final en un mismo laberinto
   * por ejemplo: laberinto: "Cursar Programacion UI"
   * habitacion: "Aula 60"
   */
  public Boolean crearHabitacion(final String unNombre) {
    Boolean _xblockexpression = null;
    {
      this.nombreHabitacion = unNombre;
      this.esInicial = Boolean.valueOf(false);
      _xblockexpression = this.esFinal = Boolean.valueOf(false);
    }
    return _xblockexpression;
  }
  
  public Boolean marcarInicial() {
    return this.esInicial = Boolean.valueOf(true);
  }
  
  public Boolean marcarFinal() {
    return this.esFinal = Boolean.valueOf(true);
  }
  
  public Boolean desmarcarInicial() {
    return this.esInicial = Boolean.valueOf(false);
  }
  
  public Boolean desmarcarFinal() {
    return this.esFinal = Boolean.valueOf(false);
  }
  
  public Object usarItem() {
    return null;
  }
  
  public Object agarrarItem() {
    return null;
  }
  
  public Object salirDeLaberinto() {
    return null;
  }
  
  @Pure
  public String getNombreHabitacion() {
    return this.nombreHabitacion;
  }
  
  public void setNombreHabitacion(final String nombreHabitacion) {
    this.nombreHabitacion = nombreHabitacion;
  }
  
  @Pure
  public ArrayList<String> getItems() {
    return this.items;
  }
  
  public void setItems(final ArrayList<String> items) {
    this.items = items;
  }
  
  @Pure
  public ArrayList<String> getItemsPermitidos() {
    return this.itemsPermitidos;
  }
  
  public void setItemsPermitidos(final ArrayList<String> itemsPermitidos) {
    this.itemsPermitidos = itemsPermitidos;
  }
  
  @Pure
  public Boolean getEsInicial() {
    return this.esInicial;
  }
  
  public void setEsInicial(final Boolean esInicial) {
    this.esInicial = esInicial;
  }
  
  @Pure
  public Boolean getEsFinal() {
    return this.esFinal;
  }
  
  public void setEsFinal(final Boolean esFinal) {
    this.esFinal = esFinal;
  }
  
  @Pure
  public ArrayList<Accion> getAcciones() {
    return this.acciones;
  }
  
  public void setAcciones(final ArrayList<Accion> acciones) {
    this.acciones = acciones;
  }
}
