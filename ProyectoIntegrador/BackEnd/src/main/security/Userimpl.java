package com.portfemfe.Emfe.Security.Service;
import com.portfemfe.Emfe.Security.Entity.Usuario;
import com.portfemfe.Emfe.Security.Entity.Useradm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Userimpl implements UserDetailsService{
    @Autowired
    Userservice usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return Useradm.build(usuario);
    }
    
    
}
