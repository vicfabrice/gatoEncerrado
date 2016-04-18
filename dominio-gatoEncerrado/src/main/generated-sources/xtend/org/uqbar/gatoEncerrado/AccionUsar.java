package org.uqbar.gatoEncerrado;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.gatoEncerrado.Accion;

@Accessors
@SuppressWarnings("all")
public class AccionUsar extends Accion {
  private String item;
  
  private String accion;
  
  public AccionUsar() {
    super();
  }
  
  public AccionUsar(final String elem, final String acc) {
    this.item = elem;
    this.accion = acc;
  }
  
  @Pure
  public String getItem() {
    return this.item;
  }
  
  public void setItem(final String item) {
    this.item = item;
  }
  
  @Pure
  public String getAccion() {
    return this.accion;
  }
  
  public void setAccion(final String accion) {
    this.accion = accion;
  }
}
