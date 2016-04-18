package org.uqbar.gatoEncerrado;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.gatoEncerrado.Accion;

@Accessors
@SuppressWarnings("all")
public class AccionAgarrar extends Accion {
  private String elemento;
  
  public AccionAgarrar() {
    super();
  }
  
  public AccionAgarrar(final String algo) {
    this.elemento = algo;
  }
  
  @Pure
  public String getElemento() {
    return this.elemento;
  }
  
  public void setElemento(final String elemento) {
    this.elemento = elemento;
  }
}
