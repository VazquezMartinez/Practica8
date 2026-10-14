package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int capacidadMaxima;
    private List<Inventariable> items;

    public Inventario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.items = new ArrayList<>();
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public List<Inventariable> getItems() {
        return items;
    }

    public boolean agregarItem(Inventariable item) {
        if (items.size() < capacidadMaxima) {
            items.add(item);
            item.registrar();
            return true;
        }
        System.out.println("Inventario lleno");
        return false;
    }

    public boolean eliminarItem(Inventariable item) {
        if (items.remove(item)) {
            item.borrar();
            return true;
        }
        return false;
    }

    public void listarItems() {
        System.out.println("Items en inventario:");
        for (Inventariable item : items) {
            System.out.println(item);
        }
    }
}
