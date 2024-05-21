package org.Hackathon.Usuario.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombre;
    private String correoElectronico;
    private String contraseña;
    private String telefono;


    // Getters y setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }

    public void setCorreoElectronico(){
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña(){
        return contraseña;
    }

    public void setContraseña(){
        this.contraseña = contraseña;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(){
        this.telefono = telefono;
    }
}
