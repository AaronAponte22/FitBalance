package com.fitbalance.model;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String password;
    private String tipoUsuario;

    // Constructor vacío
    public Usuario() {}

    // Getters y Setters
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // ... etc
}