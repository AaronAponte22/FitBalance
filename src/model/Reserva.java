package com.fitbalance.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private int idReserva;
    private int idUsuario;
    private int idServicio;
    private LocalDate fecha;
    private LocalTime hora;
    private String estado;
    private String metodoPago;
    private double monto;

    // Constructor vacío
    public Reserva() {}

    // Constructor con parámetros
    public Reserva(int idUsuario, int idServicio, LocalDate fecha, LocalTime hora, 
                   String estado, String metodoPago, double monto) {
        this.idUsuario = idUsuario;
        this.idServicio = idServicio;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.monto = monto;
    }

    // Getters y Setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", idUsuario=" + idUsuario +
                ", idServicio=" + idServicio +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", estado='" + estado + '\'' +
                ", monto=" + monto +
                '}';
    }
}