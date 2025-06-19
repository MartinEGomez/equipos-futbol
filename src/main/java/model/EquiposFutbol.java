package com.equipos.equiposfutbol.model;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos_futbol")
public class EquiposFutbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String eslogan;
    private String tecnico;
    private String pais;
    private String ciudad;
    private String categoria;

    @Column(name = "num_goles")
    private int numGoles;

    @Column(name = "num_partidos_jugados")
    private int numPartidosJugados;

    @Column(name = "num_partidos_ganados")
    private int numPartidosGanados;

    @Column(name = "num_campeonatos")
    private int numCampeonatos;

    @Column(name = "num_expulsiones")
    private int numExpulsiones;

    @Column(name = "num_empates")
    private int numEmpates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public int getNumPartidosJugados() {
        return numPartidosJugados;
    }

    public void setNumPartidosJugados(int numPartidosJugados) {
        this.numPartidosJugados = numPartidosJugados;
    }

    public int getNumPartidosGanados() {
        return numPartidosGanados;
    }

    public void setNumPartidosGanados(int numPartidosGanados) {
        this.numPartidosGanados = numPartidosGanados;
    }

    public int getNumCampeonatos() {
        return numCampeonatos;
    }

    public void setNumCampeonatos(int numCampeonatos) {
        this.numCampeonatos = numCampeonatos;
    }

    public int getNumExpulsiones() {
        return numExpulsiones;
    }

    public void setNumExpulsiones(int numExpulsiones) {
        this.numExpulsiones = numExpulsiones;
    }

    public int getNumEmpates() {
        return numEmpates;
    }

    public void setNumEmpates(int numEmpates) {
        this.numEmpates = numEmpates;
    }
}
