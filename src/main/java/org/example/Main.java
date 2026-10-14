package org.example;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario(5);

        Arma espada = new Arma("Mazo", 50, 1.5);
        Recompensa oro = new Recompensa("oro", 100, "moneda");

        inventario.agregarItem(espada);
        inventario.agregarItem(oro);

        Personaje jugador = new Personaje("Pato", 100, 0, 0);
        Utileria pocion = new Utileria("Pocion", "Recupera vida", 2, 2);

        Obstaculo roca = new Obstaculo("Roca", 10, 3, 3);

        CheckPoint cp = new CheckPoint("CP1", 5, 5);

        Nivel nivel = new Nivel("Bosque", 1, "Facil", inventario);

        nivel.agregarElementoDinamico(jugador);
        nivel.agregarElementoDinamico(pocion);
        nivel.agregarObstaculo(roca);
        nivel.agregarCheckPoint(cp);
        nivel.moverElementosDinamicos("oeste", 3);
        nivel.moverElementosDinamicos("norte", 5);
        nivel.moverElementosDinamicos("sur",10);
        nivel.mostrarEstado();

        jugador.recibirDanio(101);
    }
}