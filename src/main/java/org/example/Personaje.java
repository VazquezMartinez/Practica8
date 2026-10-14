package org.example;

public class Personaje implements Destruible, ElementoDinamico {
    private String nombre;
    private int vida;
    private int posicionX;
    private int posicionY;
    private boolean estaVivo;

    public Personaje(String nombre, int vida, int x, int y) {
        this.nombre = nombre;
        this.vida = vida;
        this.posicionX = x;
        this.posicionY = y;
    }

    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
    }
    public int getPosicionX() {
        return posicionX;
    }
    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicion(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        System.out.println(nombre + " ha recibido danio\n Vida actual: " + vida);
        if (vida <= 0){
            destruye();
            estaVivo = false;
        }
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

        System.out.println(nombre + " se movio a (" + posicionX + ", " + posicionY + ")");
    }

    @Override
    public void destruye() {
        System.out.println(nombre + " ha muerto");
    }
}
