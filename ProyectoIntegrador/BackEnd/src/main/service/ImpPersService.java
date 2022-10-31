
package com.portfemfe.Emfe.Service;

import com.portfemfe.Emfe.Entity.Persona;
import com.portfemfe.Emfe.Repository.InterRepoPer;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional

public class ImpPersService{
    @Autowired 
    InterRepoPer interrepoper;
    
     public List<Persona> list(){
         return interrepoper.findAll();
     }
     
     public Optional<Persona> getOne(int id){
         return interrepoper.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre){
         return interrepoper.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         interrepoper.save(persona);
     }
     
     public void delete(int id){
         interrepoper.deleteById(id);
     }
     
     public boolean existsById(int id){
         return interrepoper.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return interrepoper.existsByNombre(nombre);
     }
    
}
