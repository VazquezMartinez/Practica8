package org.example;

public class Utileria implements ElementoDinamico {
    private String nombre;
    private String descripcion;
    private int posicionX;
    private int posicionY;

    public Utileria(String nombre, String descripcion, int x, int y) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.posicionX = x;
        this.posicionY = y;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPosicionX() {
        return posicionX;
    }
    public int getPosicionY() {
        return posicionY;
    }

    public void usar() {
        System.out.println("Usando: " + nombre);
    }

    @Override
    public void mover(String direccion, int distancia) {
        switch (direccion.toLowerCase()) {
            case "norte":
                posicionY += distancia;
                break;
            case "sur":
                posicionY -= distancia;
                break;
            case "este":
                posicionX += distancia;
                break;
            case "oeste":
                posicionX -= distancia;
                break;
        }
    }
}