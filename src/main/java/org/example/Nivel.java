package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nivel {
    private String nombre;
    private int numero;
    private String dificultad;
    private List<Obstaculo> obstaculos;
    private List<CheckPoint> checkPoints;
    private List<ElementoDinamico> elementosDinamicos;
    private Inventario inventario;

    public Nivel(String nombre, int numero, String dificultad, Inventario inventario) {
        this.nombre = nombre;
        this.numero = numero;
        this.dificultad = dificultad;
        this.inventario = inventario;

        obstaculos = new ArrayList<>();
        checkPoints = new ArrayList<>();
        elementosDinamicos = new ArrayList<>();
    }

    public void agregarObstaculo(Obstaculo o) {
        obstaculos.add(o);
    }

    public void agregarCheckPoint(CheckPoint c) {
        checkPoints.add(c);
    }

    public void agregarElementoDinamico(ElementoDinamico e) {
        elementosDinamicos.add(e);
    }

    public void moverElementosDinamicos(String direccion, int distancia) {
        for (ElementoDinamico e : elementosDinamicos) {
            e.mover(direccion, distancia);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nivel: " + nombre);
        System.out.println("Numero: " + numero);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Obstaculos: " + obstaculos.size());
        System.out.println("CheckPoints: " + checkPoints.size());
        System.out.println("Elementos dinamicos: " + elementosDinamicos.size());
    }

    public List<ElementoDinamico> getElementosDinamicos() {
        return elementosDinamicos;
    }

    public List<Obstaculo> getObstaculos() {
        return obstaculos;
    }

    public List<CheckPoint> getCheckPoints() {
        return checkPoints;
    }
}
