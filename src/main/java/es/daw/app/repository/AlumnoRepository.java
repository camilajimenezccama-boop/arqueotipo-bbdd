package es.daw.app.repository;
import es.daw.app.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository
        extends JpaRepository<Alumno, Long> {
}