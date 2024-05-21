package org.Hackathon.Etiqueta.Domain;

import jakarta.persistence.*;
import org.Hackathon.Salon.Domain.Salon;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtiqueta;

    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "salon_etiqueta",
            joinColumns = @JoinColumn(name = "etiqueta_id"),
            inverseJoinColumns = @JoinColumn(name = "salon_id")
    )
    private List<Salon> salones;

    // Getters y setters
    public int getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setId(int idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
