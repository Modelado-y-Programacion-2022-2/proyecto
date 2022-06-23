package modeladoyprogramacion.proyecto;

import modeladoyprogramacion.proyecto.acompañamientos.Acompañamientos;
import modeladoyprogramacion.proyecto.complementos.Complementos;

public class Orden {
    private Hamburguesa hamburguesa;
    private Complementos complementos;
    private Acompañamientos acompañamientos;
    

    public Orden(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }
}
