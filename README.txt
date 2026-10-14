PROJECT TITLE: Practica8
PURPOSE OF PROJECT: Clases, Metodos, Atributos y Colecciones
VERSION or DATE: 14/10/26
HOW TO START THIS PROJECT: Este proyecto consiste en la implementación de un sistema orientado a objetos en 
Java basado en un diagrama UML previamente diseñado. El sistema simula un entorno de videojuego donde 
existen niveles, personajes, obstáculos, utilerías e inventarios. Se aplican conceptos fundamentales de 
programación orientada a objetos como encapsulamiento, herencia, polimorfismo e implementación de interfaces.

ESTRUCTURA DEL PROYECTO

El proyecto se encuentra dentro del paquete:

org.example

Clases principales:

Nivel: Representa un nivel del juego, contiene obstáculos, checkpoints y elementos dinámicos.
Personaje: Representa al jugador, puede moverse y recibir daño.
Utileria: Objetos que pueden moverse y ser utilizados.
Obstaculo: Elementos estáticos que afectan el entorno.
CheckPoint: Punto de guardado dentro del nivel.
Inventario: Contenedor de objetos tipo Inventariable.
Arma: Objeto que puede almacenarse en el inventario.
Recompensa: Elemento que puede ser recolectado.

Interfaces:

ElementoDinamico: Define el comportamiento de movimiento.
Inventariable: Define objetos que pueden guardarse en el inventario.
Destruible: Define objetos que pueden recibir daño.

FUNCIONALIDAD PRINCIPAL

En la clase Main se realiza lo siguiente:

Se crea un inventario con capacidad definida.
Se crean objetos como armas y recompensas y se agregan al inventario.
Se crea un nivel con sus atributos.
Se agregan elementos dinámicos (Personaje y Utileria).
Se agregan obstáculos y checkpoints.
Se ejecuta el método moverElementosDinamicos().

Y al final el personaje recibe danio hasta que se acaba su vida y se activa la interface de destruible.

AUTHORS: Vazquez Martinez Ivan Alonso

