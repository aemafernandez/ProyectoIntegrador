
package com.portfemfe.Emfe.Security.Repository;
import com.portfemfe.Emfe.Security.Entity.Rol;
import com.portfemfe.Emfe.Security.List.Rolnombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rolrepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(Rolnombre rolNombre);
}
