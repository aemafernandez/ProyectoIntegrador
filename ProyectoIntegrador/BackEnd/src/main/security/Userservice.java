
package com.portfemfe.Emfe.Security.Service;
import com.portfemfe.Emfe.Security.Entity.Usuario;
import com.portfemfe.Emfe.Security.Repository.Userrepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Userservice {
    @Autowired
    Userrepository userrepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return userrepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return userrepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return userrepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        userrepository.save(usuario);
    }
}
