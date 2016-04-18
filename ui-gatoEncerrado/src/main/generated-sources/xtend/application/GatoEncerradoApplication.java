package application;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import org.uqbar.gatoEncerrado.Juego;
import windows.PantallaInicialAdmin;

@SuppressWarnings("all")
public class GatoEncerradoApplication extends Application {
  protected Window<?> createMainWindow() {
    Juego _juego = new Juego("Pablo");
    return new PantallaInicialAdmin(this, _juego);
  }
  
  public static void main(final String[] args) {
    GatoEncerradoApplication _gatoEncerradoApplication = new GatoEncerradoApplication();
    _gatoEncerradoApplication.start();
  }
}
