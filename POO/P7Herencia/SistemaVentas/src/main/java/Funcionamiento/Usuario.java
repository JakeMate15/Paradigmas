/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionamiento;

import java.util.Objects;

/**
 *
 * @author erikm
 */
public class Usuario {
    private String nombre;
    private String paterno;
    private String user;
    private String contrasena;
    private boolean tipo;

    public Usuario(String nombre, String paterno, String user, String contrasena, boolean tipo) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.user = user;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre + " " + paterno;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        return true;
    }
    
    
}
