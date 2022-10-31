package com.portfemfe.Emfe.Security.Service;
import com.portfemfe.Emfe.Security.Entity.Rol;
import com.portfemfe.Emfe.Security.List.Rolnombre;
import com.portfemfe.Emfe.Security.Repository.Rolrepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Rolservice {
    @Autowired
    Rolrepository rolrepository;
    
    public Optional<Rol> getByRolnombre(Rolnombre rolnombre){
        return rolrepository.findByRolNombre(rolnombre);
    }
    
    public void save(Rol rol){
        rolrepository.save(rol);
    }
}