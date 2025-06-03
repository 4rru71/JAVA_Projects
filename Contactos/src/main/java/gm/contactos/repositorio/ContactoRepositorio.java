package gm.contactos.repositorio;

import gm.contactos.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;


//De esta forma interactua con la DB
public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {
}
