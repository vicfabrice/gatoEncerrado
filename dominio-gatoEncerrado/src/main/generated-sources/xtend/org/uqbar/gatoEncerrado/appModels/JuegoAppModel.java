package org.uqbar.gatoEncerrado.appModels;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import org.uqbar.gatoEncerrado.Accion;
import org.uqbar.gatoEncerrado.Habitacion;
import org.uqbar.gatoEncerrado.Juego;
import org.uqbar.gatoEncerrado.Laberinto;

@Observable
@Accessors
@SuppressWarnings("all")
public class JuegoAppModel {
  private Juego juego;
  
  private Laberinto laberintoSeleccionado;
  
  private Habitacion habitacionSeleccionada;
  
  private String nombreHabitacion;
  
  private String admin;
  
  private Accion accionSeleccionada;
  
  public JuegoAppModel(final Juego j) {
    this.juego = j;
    String _admin = this.juego.getAdmin();
    this.admin = _admin;
  }
  
  public List<Laberinto> getLaberintos() {
    return this.juego.getLaberintos();
  }
  
  @Pure
  public Juego getJuego() {
    return this.juego;
  }
  
  public void setJuego(final Juego juego) {
    this.juego = juego;
  }
  
  @Pure
  public Laberinto getLaberintoSeleccionado() {
    return this.laberintoSeleccionado;
  }
  
  public void setLaberintoSeleccionado(final Laberinto laberintoSeleccionado) {
    this.laberintoSeleccionado = laberintoSeleccionado;
  }
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  public void setHabitacionSeleccionada(final Habitacion habitacionSeleccionada) {
    this.habitacionSeleccionada = habitacionSeleccionada;
  }
  
  @Pure
  public String getNombreHabitacion() {
    return this.nombreHabitacion;
  }
  
  public void setNombreHabitacion(final String nombreHabitacion) {
    this.nombreHabitacion = nombreHabitacion;
  }
  
  @Pure
  public String getAdmin() {
    return this.admin;
  }
  
  public void setAdmin(final String admin) {
    this.admin = admin;
  }
  
  @Pure
  public Accion getAccionSeleccionada() {
    return this.accionSeleccionada;
  }
  
  public void setAccionSeleccionada(final Accion accionSeleccionada) {
    this.accionSeleccionada = accionSeleccionada;
  }
}
