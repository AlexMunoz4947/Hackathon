package org.Hackathon.Salon.Domain;

import jakarta.persistence.*;
import org.Hackathon.Etiqueta.Domain.Etiqueta;
import org.Hackathon.Reserva.Domain.Reserva;

import java.util.List;

@Entity
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalon;

    private String nombre;
    private int capacidad;
    private String ubicación;
    private String descripcion;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservas;

    @ManyToMany(mappedBy = "salones")
    private List<Etiqueta> etiquetas;

    public int getIdSalon() {
        return idSalon;
    }

    public void setId(int idSalon) {
        this.idSalon = idSalon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad() {
        this.capacidad = capacidad;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación() {
        this.ubicación = ubicación;
    }

    public void setDescripcion() {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }


}
