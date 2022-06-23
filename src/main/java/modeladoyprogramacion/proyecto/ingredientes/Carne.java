package modeladoyprogramacion.proyecto.ingredientes;

public class Carne {
    private TipoCarne tipoCarne;
    private boolean dobleCarne;
    
    public Carne(){}
    
    public Carne(TipoCarne tipoCarne, boolean dobleCarne) {
        this.tipoCarne = tipoCarne;
        this.dobleCarne = dobleCarne;
    }

    public Carne(boolean dobleCarne) {
        this.dobleCarne = dobleCarne;
    }

    public TipoCarne getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(TipoCarne tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isDobleCarne() {
        return dobleCarne;
    }

    public void setDobleCarne(boolean dobleCarne) {
        this.dobleCarne = dobleCarne;
    }

    
}


