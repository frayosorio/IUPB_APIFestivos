package apifestivos.festivos.interfaces;

import java.util.Date;
import java.util.List;

public interface IFestivoServicio {

    public boolean esFestivo(Date Fecha);

    public List<Date> obtenerFestivos(int año);

}
