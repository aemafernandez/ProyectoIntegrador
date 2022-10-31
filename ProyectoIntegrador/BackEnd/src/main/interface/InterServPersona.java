
package com.portfemfe.Emfe.Interface;

import com.portfemfe.Emfe.Entity.Persona;
import java.util.List;


public interface InterServPersona {
    public List<Persona> getpersona();
    
    public void savePersona (Persona persona);
    
    public void deletePersona (Long id);
    
    public Persona findPersona (Long id);
    
}
