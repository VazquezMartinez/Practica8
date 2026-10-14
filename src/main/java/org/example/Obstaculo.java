package org.example;

public class Obstaculo implements Destruible {
    private String nombre;
    private int danio;
    private int posicionX;
    private int posicionY;

    public Obstaculo(String nombre, int danio, int x, int y) {
        this.nombre = nombre;
        this.danio = danio;
        this.posicionX = x;
        this.posicionY = y;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDanio() {
        return danio;
    }
    public int getPosicionX() {
        return posicionX;
    }
    public int getPosicionY() {
        return posicionY;
    }

    @Override
    public void destruye() {
        System.out.println("Obstaculo destruido: " + nombre);
    }
}
