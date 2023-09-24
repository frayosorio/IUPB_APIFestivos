package apifestivos.festivos.controladores;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apifestivos.festivos.interfaces.IFestivoServicio;

@RestController
@RequestMapping("/festivos")
public class FestivoControlador {

    @Autowired
    private IFestivoServicio servicio;

    @RequestMapping(value = "/verificar/{año}/{mes}/{dia}", method = RequestMethod.GET)
    public String verificarFestivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        try {
            Date fecha = new Date(año-1900, mes-1, dia);

            return servicio.esFestivo(fecha) ? "Es Festivo" : "No es festivo";

        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "/obtener/{año}", method = RequestMethod.GET)
    public List<Date> obtener(@PathVariable int año) {
        return servicio.obtenerFestivos(año);
    }

}
