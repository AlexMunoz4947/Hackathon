package org.Hackathon.SalonEtiqueta.Domain;

import jakarta.persistence.*;
import org.Hackathon.Etiqueta.Domain.Etiqueta;
import org.Hackathon.Salon.Domain.Salon;

@Entity
@Table(name = "SalonEtiqueta")
public class SalonEtiqueta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idSalon", nullable = false)
    private Salon salon;

    @ManyToOne
    @JoinColumn(name = "idEtiqueta", nullable = false)
    private Etiqueta etiqueta;

    // Constructor vacío
    public SalonEtiqueta() {}

    // Constructor con parámetros
    public SalonEtiqueta(Salon idSalon, Etiqueta idEtiqueta) {
        this.salon = idSalon;
        this.etiqueta = idEtiqueta;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }
}
