package org.Hackathon.Reserva.Domain;

import jakarta.persistence.*;
import org.Hackathon.Salon.Domain.Salon;
import org.Hackathon.Usuario.Domain.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "salon_id")
    private Salon salon;

    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    // Getters y setters

    public int getIdReserva() {
        return idReserva;
    }

    public void setId(int id) {
        this.idReserva = idReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin(){
        return horaFin;
    }

    public void setHoraFin(){
        this.horaFin = horaFin;
    }

}
