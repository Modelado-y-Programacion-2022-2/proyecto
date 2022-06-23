package modeladoyprogramacion.proyecto;

import java.util.List;

import modeladoyprogramacion.proyecto.ingredientes.*;

public class Hamburguesa {
    private Pan pan;
    private Carne carne;
    private List<Condimento> condimentos;
    private List<Verdura> verduras;
    private List<Queso> quesos;
    private TipoHamburguesa tipoHamburguesa;
    private int precio;

    public Hamburguesa() {}

    public Hamburguesa(TipoHamburguesa tipoHamburguesa, Pan pan, Carne carne, 
                       List<Condimento> condimentos, 
                       List<Verdura> verduras, 
                       List<Queso> quesos) {
        this.pan = pan;
        this.carne = carne;
        this.condimentos = condimentos;
        this.verduras = verduras;
        this.quesos = quesos;
    }

    public Hamburguesa(TipoHamburguesa tipoHamburguesa, Carne carne, 
                       List<Condimento> condimentos, 
                       List<Verdura> verduras, 
                       List<Queso> quesos) {
        this.tipoHamburguesa = tipoHamburguesa;
        this.carne = carne;
        this.condimentos = condimentos;
        this.verduras = verduras;
        this.quesos = quesos;
    }


    public List<Queso> getQuesos() {
        return quesos;
    }

    public void setQuesos(List<Queso> quesos) {
        this.quesos = quesos;
    }

    public TipoHamburguesa getTipoHamburguesa() {
        return tipoHamburguesa;
    }

    public void setTipoHamburguesa(TipoHamburguesa tipoHamburguesa) {
        this.tipoHamburguesa = tipoHamburguesa;
    }

    public Hamburguesa(TipoHamburguesa tipoHamburguesa, List<Condimento> condimentos, 
                       List<Verdura> verduras, List<Queso> quesos) {
                        this.tipoHamburguesa = tipoHamburguesa;
                        this.condimentos = condimentos;
                        this.verduras = verduras;
                        this.quesos = quesos;
                       }

    public Pan getPan() {
        return pan;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public Carne getCarne() {
        return carne;
    }

    public void setCarne(Carne carne) {
        this.carne = carne;
    }

    public List<Condimento> getCondimentos() {
        return condimentos;
    }

    public void setCondimentos(List<Condimento> condimentos) {
        this.condimentos = condimentos;
    }

    public List<Verdura> getVerduras() {
        return verduras;
    }

    public void setVerduras(List<Verdura> verduras) {
        this.verduras = verduras;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}



