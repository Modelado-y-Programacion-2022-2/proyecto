package modeladoyprogramacion.proyecto.acompañamientos;

public class Acompañamientos {
    private Refresco refresco;
    private int refresco_precio = 15;

    private boolean papas;
    private int precio_papas = 20;
    
    private boolean cebollas;
    private int precio_cebollas = 10;

    public Acompañamientos(Refresco refresco, boolean papas, boolean cebollas) {
        this.refresco = refresco;
        this.papas = papas;
        this.cebollas = cebollas;
    }
    
    public int getRefresco_precio() {
        return refresco_precio;
    }

    public void setRefresco_precio(int refresco_precio) {
        this.refresco_precio = refresco_precio;
    }

    public boolean isPapas() {
        return papas;
    }

    public void setPapas(boolean papas) {
        this.papas = papas;
    }

    public int getPrecio_papas() {
        return precio_papas;
    }

    public void setPrecio_papas(int precio_papas) {
        this.precio_papas = precio_papas;
    }

    public boolean isCebollas() {
        return cebollas;
    }

    public void setCebollas(boolean cebollas) {
        this.cebollas = cebollas;
    }

    public int getPrecio_cebollas() {
        return precio_cebollas;
    }

    public void setPrecio_cebollas(int precio_cebollas) {
        this.precio_cebollas = precio_cebollas;
    }

    public Refresco getRefresco() {
        return refresco;
    }

    public void setRefresco(Refresco refresco) {
        this.refresco = refresco;
    }

    public boolean hayPapas() {
        return papas;
    }

    public void setHayPapas(boolean papas) {
        this.papas = papas;
    }

    public boolean hayCebollas() {
        return cebollas;
    }

    public void setHayCebollas(boolean cebollas) {
        this.cebollas = cebollas;
    }

    public double getPrecioPapas() {
        return precio_papas;
    }

    public void setPrecioPapas(int precio) {
        this.precio_papas = precio;
    }
    
    public double getPrecioCebollas() {
        return precio_cebollas;
    }

    public void setPrecioCebollas(int precio) {
        this.precio_cebollas = precio;
    }
}
