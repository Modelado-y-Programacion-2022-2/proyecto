package modeladoyprogramacion.proyecto.complementos;

import modeladoyprogramacion.proyecto.ingredientes.Queso;

public class Complementos {
    Queso queso;
    int precio_queso = 10;

    boolean piña;
    int precio_piña = 10;

    Salsa salsa;
    int precio_salsa = 10;

    public Complementos() {}

    public Complementos(Queso queso, boolean piña, int precio_piña, Salsa salsa) {
        this.queso = queso;
        this.piña = piña;
        this.precio_piña = precio_piña;
        this.salsa = salsa;
    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(Queso queso) {
        this.queso = queso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public double getPrecio_piña() {
        return precio_piña;
    }

    public void setPrecio_piña(int precio_piña) {
        this.precio_piña = precio_piña;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }
    
}
