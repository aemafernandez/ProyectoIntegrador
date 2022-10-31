
package com.portfemfe.Emfe.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
     private String nombre;
    @NotBlank
    private String descripcionp;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcionp) {
        this.nombre = nombre;
        this.descripcionp = descripcionp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionp() {
        return descripcionp;
    }

    public void setDescripcionp(String descripcionp) {
        this.descripcionp = descripcionp;
    }
    
}
