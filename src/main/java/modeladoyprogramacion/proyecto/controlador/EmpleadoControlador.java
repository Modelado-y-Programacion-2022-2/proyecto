package modeladoyprogramacion.proyecto.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import modeladoyprogramacion.proyecto.Hamburguesa;
import modeladoyprogramacion.proyecto.Orden;
import modeladoyprogramacion.proyecto.TipoHamburguesa;
import modeladoyprogramacion.proyecto.complementos.Complementos;
import modeladoyprogramacion.proyecto.ingredientes.*;
import modeladoyprogramacion.proyecto.servicio.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/menuempleado")
public class EmpleadoControlador {

    @Autowired
    Inventario inventario;
    
    @GetMapping("/vermenu") 
    public String verMenu() {
        return "empleado/vermenu";
    }

    @GetMapping("/tipohamburguesa") 
    public String seleccionaHamburguesa(){
        return "empleado/tipohamburguesa";
    }

    @PostMapping("/ordenhamburguesa")
    public String pedidoHamburguesa(HttpServletRequest request, Model model) {
        String tipoHamburguesa = request.getParameter("hamburguesa");

        List<Condimento> condimentos = Arrays.asList(Condimento.class.getEnumConstants());
        List<Verdura> verduras = Arrays.asList(Verdura.class.getEnumConstants());
        List<Queso> quesos = new ArrayList<Queso>();
        Carne carne = new Carne();

        if (tipoHamburguesa.equals("sencilla")) {
            quesos.add(Queso.CHEDDAR);
            carne.setDobleCarne(false);

            Hamburguesa hamburguesa = new Hamburguesa(TipoHamburguesa.SENCILLA, 
                                                      carne, 
                                                      condimentos, 
                                                      verduras, 
                                                      quesos);
            hamburguesa.setPrecio(100);
            hamburguesa.setTipoHamburguesa(TipoHamburguesa.SENCILLA);
            model.addAttribute("hamburguesa", hamburguesa);
        } else if (tipoHamburguesa.equals("doble")) {
            quesos.add(Queso.CHEDDAR);
            quesos.add(Queso.CHEDDAR);
            carne.setDobleCarne(true);
            Hamburguesa hamburguesa = new Hamburguesa(TipoHamburguesa.DOBLE,
                                                      carne,
                                                      condimentos,
                                                      verduras,
                                                      quesos);
            hamburguesa.setPrecio(150);
            hamburguesa.setTipoHamburguesa(TipoHamburguesa.DOBLE);
            model.addAttribute("hamburguesa", hamburguesa);
        } else if (tipoHamburguesa.equals("hawaiana")) {
            quesos.add(Queso.CHEDDAR);
            quesos.add(Queso.OAXACA);
            carne.setDobleCarne(false);
            Hamburguesa hamburguesa = new Hamburguesa(TipoHamburguesa.HAWAIANA,
                                                      carne,
                                                      condimentos,
                                                      verduras,
                                                      quesos);
            hamburguesa.setPrecio(120);
            hamburguesa.setTipoHamburguesa(TipoHamburguesa.HAWAIANA);
            model.addAttribute("hamburguesa", hamburguesa);
        } else {
            model.addAttribute("hamburguesa", new Hamburguesa());
        }
        return "empleado/hamburguesa";
    }

    @GetMapping("/complementos")
    public String getComplementos(HttpServletRequest request, 
            @ModelAttribute("hamburguesa") Hamburguesa  hamburguesa,
            Model model) {
        Orden orden = new Orden(hamburguesa);
        Complementos complementos = new Complementos(); 
        model.addAttribute("complementos", complementos);
        inventario.actualizaInventarioPan("Integral", 40);
        model.addAttribute("inventario", inventario);
        return "empleado/complementos";
    }

    @PostMapping("/complementos")
    public String postComplementos(HttpServletRequest request,
        @ModelAttribute("complementos") Complementos  complementos,
        Model model) {
        String p = request.getParameter("pina");
        if (p.equals("si")) {
            complementos.setPiña(true);
        }
        return "empleado/acompañamientos";
    }

}
