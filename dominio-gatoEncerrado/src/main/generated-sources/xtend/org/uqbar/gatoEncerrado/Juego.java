package org.uqbar.gatoEncerrado;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import org.uqbar.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class Juego {
  private List<Laberinto> laberintos;
  
  private String admin;
  
  public Juego(final String nombreadmin) {
    ArrayList<Laberinto> _newArrayList = CollectionLiterals.<Laberinto>newArrayList();
    this.laberintos = _newArrayList;
    this.admin = nombreadmin;
  }
  
  public void eliminarLaberinto(final Laberinto noVaMas) {
    this.laberintos.remove(noVaMas);
  }
  
  public void agregarLaberinto(final Laberinto laberinto) {
    this.laberintos.add(laberinto);
  }
  
  @Pure
  public List<Laberinto> getLaberintos() {
    return this.laberintos;
  }
  
  public void setLaberintos(final List<Laberinto> laberintos) {
    this.laberintos = laberintos;
  }
  
  @Pure
  public String getAdmin() {
    return this.admin;
  }
  
  public void setAdmin(final String admin) {
    this.admin = admin;
  }
}
