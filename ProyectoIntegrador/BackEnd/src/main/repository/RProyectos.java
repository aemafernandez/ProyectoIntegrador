
package com.portfemfe.Emfe.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.portfemfe.Emfe.Entity.Proyectos;
import org.springframework.stereotype.Repository;

public interface RProyectos extends JpaRepository<Proyectos, Integer> {
    Optional<Proyectos> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
    
}

