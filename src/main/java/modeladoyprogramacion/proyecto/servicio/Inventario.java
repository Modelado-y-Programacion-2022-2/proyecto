package modeladoyprogramacion.proyecto.servicio;
import modeladoyprogramacion.proyecto.ingredientes.*;
import java.util.HashMap;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Inventario {
    private HashMap<Pan, Integer> inventarioPan;
    private HashMap<TipoCarne, Integer> inventarioCarne;
    private HashMap<Queso, Integer> inventarioQueso;
    private HashMap<Verdura, Integer> inventarioVerdura;

    
    public HashMap<Pan, Integer> getInventarioPan() {
        return inventarioPan;
    }
    public void setInventarioPan(HashMap<Pan, Integer> inventarioPan) {
        this.inventarioPan = inventarioPan;
    }
    public HashMap<TipoCarne, Integer> getInventarioCarne() {
        return inventarioCarne;
    }
    public void setInventarioCarne(HashMap<TipoCarne, Integer> inventarioCarne) {
        this.inventarioCarne = inventarioCarne;
    }
    public HashMap<Queso, Integer> getInventarioQueso() {
        return inventarioQueso;
    }
    public void setInventarioQueso(HashMap<Queso, Integer> inventarioQueso) {
        this.inventarioQueso = inventarioQueso;
    }
    public HashMap<Verdura, Integer> getInventarioVerdura() {
        return inventarioVerdura;
    }
    public void setInventarioVerdura(HashMap<Verdura, Integer> inventarioVerdura) {
        this.inventarioVerdura = inventarioVerdura;
    }
}
