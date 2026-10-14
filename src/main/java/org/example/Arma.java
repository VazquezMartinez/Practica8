package org.example;

public class Arma implements Inventariable {
    private String nombre;
    private int danio;
    private double alcance;

    public Arma(String nombre, int danio, double alcance) {
        this.nombre = nombre;
        this.danio = danio;
        this.alcance = alcance;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDanio() {
        return danio;
    }
    public double getAlcance() {
        return alcance;
    }

    @Override
    public void registrar() {
        System.out.println("Arma registrada: " + nombre);
    }

    @Override
    public void borrar() {
        System.out.println("Arma eliminada: " + nombre);
    }
}