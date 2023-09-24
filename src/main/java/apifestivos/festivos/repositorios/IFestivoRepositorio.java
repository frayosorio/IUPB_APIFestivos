package apifestivos.festivos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apifestivos.festivos.modelos.Festivo;

@Repository
public interface IFestivoRepositorio extends JpaRepository<Festivo, Long> {

}
