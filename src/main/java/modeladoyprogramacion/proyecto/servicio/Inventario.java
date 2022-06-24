package modeladoyprogramacion.proyecto.servicio;
import modeladoyprogramacion.proyecto.Hamburguesa;
import modeladoyprogramacion.proyecto.TipoHamburguesa;
import modeladoyprogramacion.proyecto.ingredientes.*;
import java.util.HashMap;

import javax.persistence.criteria.CriteriaBuilder.Case;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Inventario {
    private HashMap<String, Integer> inventarioPan = 
    new HashMap<String, Integer>(){{
        put("Integral", 150);
        put("Trigo", 150);
        put("Extreme", 150);
        put("Ajo", 150);
    }};
    private HashMap<String, Integer> inventarioCarne = 
    new HashMap<String, Integer>(){{
        put("Pollo", 150);
        put("Res", 150);
        put("Soya", 150);
        put("Extreme", 150);
    }};
    private HashMap<String, Integer> inventarioQueso = 
    new HashMap<String, Integer>(){{
        put("Cheddar", 150);
        put("Oaxaca", 150);
    }};

    private HashMap<String, Integer> inventarioVerdura = 
    new HashMap<String, Integer>(){{
        put("Aguacate", 150);
        put("Cebolla", 150);
        put("Jitomate", 150);
        put("Lechuga", 150);
        put("Pepinillos", 150);
    }};

    private HashMap<String, Integer> inventarioCondimento = 
    new HashMap<String, Integer>(){{
        put("Catsup", 150);
        put("Mayonesa", 150);
        put("Mostaza", 150);
    }};

    private HashMap<String, Integer> inventarioRefresco = 
    new HashMap<String, Integer>(){{
        put("Coca-cola", 150);
        put("Fanta", 150);
        put("Sprite", 150);
        put("Agua Mineral", 150);
    }};

    private HashMap<String, Integer> inventarioPiña = 
    new HashMap<String, Integer>(){{
        put("Piña", 150);
    }};

    private HashMap<String, Integer> inventarioSalsa = 
    new HashMap<String, Integer>(){{
        put("Secreta", 150);
        put("BBQ", 150);
        put("Chipotle", 150);
    }};

    private HashMap<String, Integer> inventarioPapasYCebollas = 
    new HashMap<String, Integer>(){{
        put("Papas fritas", 150);
        put("Cebolla", 150);
    }};

    Inventario(){}
    
    public void actualizaInventario(Hamburguesa hamburguesa) {
        actualizaInventarioVerdura("Aguacate", 1);
        actualizaInventarioVerdura("Cebolla", 1);
        actualizaInventarioVerdura("Jitomate", 1);
        actualizaInventarioVerdura("Lechuga", 1);
        actualizaInventarioVerdura("Pepinillos", 1);

        actualizaInventarioCondimento("Catsup", 1);
        actualizaInventarioCondimento("Mayonesa", 1);
        actualizaInventarioCondimento("Mostaza", 1);

        if (hamburguesa.getTipoHamburguesa() == TipoHamburguesa.SENCILLA ) {
            switch(hamburguesa.getCarne().getTipoCarne()) {
            case EXTREME:
                actualizaInventarioCarne("Extreme",1);
                break;
            case POLLO:
                actualizaInventarioCarne("Pollo",1);
                break;
            case RES:
                actualizaInventarioCarne("Res",1);
                break;
            case SOYA:
                actualizaInventarioCarne("Soya",1);
                break;
            }
            switch(hamburguesa.getPan()) {
                case INTEGRAL:
                    actualizaInventarioPan("Integral",2);
                    break;
                case TRIGO:
                    actualizaInventarioPan("Trigo",2);
                    break;
                case EXTREME:
                    actualizaInventarioPan("Extreme",2);
                    break;
                case AJO:
                    actualizaInventarioPan("Ajo",2);
                    break;
                }
        } else if (hamburguesa.getTipoHamburguesa() == TipoHamburguesa.DOBLE) {
            switch(hamburguesa.getCarne().getTipoCarne()) {
            case EXTREME:
                actualizaInventarioCarne("Extreme",2);
                break;
            case POLLO:
                actualizaInventarioCarne("Pollo",2);
                break;
            case RES:
                actualizaInventarioCarne("Res",2);
                break;
            case SOYA:
                actualizaInventarioCarne("Soya",2);
                break;
            }
            switch(hamburguesa.getPan()) {
                case INTEGRAL:
                    actualizaInventarioPan("Integral",3);
                    break;
                case TRIGO:
                    actualizaInventarioPan("Trigo",3);
                    break;
                case EXTREME:
                    actualizaInventarioPan("Extreme",3);
                    break;
                case AJO:
                    actualizaInventarioPan("Ajo",3);
                    break;
                }
        }

    }

    public void actualizaInventarioCondimento(String condimento, int i) {
        this.inventarioCondimento.put(condimento, this.inventarioCondimento.get(condimento) - i);
    }
    public void actualizaInventarioPan(String pan, int i) {
            this.inventarioPan.put(pan, this.inventarioPan.get(pan) - i);
    }

    public void actualizaInventarioCarne(String carne, int i) {
        this.inventarioCarne.put(carne, this.inventarioCarne.get(carne) - i);
    }

    public void actualizaInventarioQueso(String queso, int i) {
        this.inventarioQueso.put(queso, this.inventarioQueso.get(queso) - i);
    }

    public void actualizaInventarioVerdura(String verdura, int i) {
        this.inventarioVerdura.put(verdura, this.inventarioVerdura.get(verdura) - i);
    }
    public void actualizaInventarioRefresco(String refresco, int i) {
        this.inventarioRefresco.put(refresco, this.inventarioRefresco.get(refresco) - i);
    }

    public void actualizaInventarioPiña(String piña, int i) {
        this.inventarioPiña.put(piña, this.inventarioPiña.get(piña) - i);
    }

    public void actualizaInventarioSalsa(String salsa, int i) {
        this.inventarioPiña.put(salsa, this.inventarioSalsa.get(salsa) - i);
    }

    public void actualizaInventarioPapasYCebollas(String pyc, int i) {
        this.inventarioPapasYCebollas.put(pyc, this.inventarioPapasYCebollas.get(pyc) - i);
    }

    public HashMap<String, Integer> getInventarioPan() {
        return inventarioPan;
    }
    public void setInventarioPan(HashMap<String, Integer> inventarioPan) {
        this.inventarioPan = inventarioPan;
    }
    public HashMap<String, Integer> getInventarioCarne() {
        return inventarioCarne;
    }
    public void setInventarioCarne(HashMap<String, Integer> inventarioCarne) {
        this.inventarioCarne = inventarioCarne;
    }
    public HashMap<String, Integer> getInventarioQueso() {
        return inventarioQueso;
    }
    public void setInventarioQueso(HashMap<String, Integer> inventarioQueso) {
        this.inventarioQueso = inventarioQueso;
    }
    public HashMap<String, Integer> getInventarioVerdura() {
        return inventarioVerdura;
    }
    public void setInventarioVerdura(HashMap<String, Integer> inventarioVerdura) {
        this.inventarioVerdura = inventarioVerdura;
    }
}
