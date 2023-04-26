import java.util.Scanner;
import java.util.Random;
import Colas.Pila;
import Colas.Cola;

public class Laberinto {

  private Coordenada inicio;
  private Coordenada salida;
  private int altura;
  private int ancho;
  private char[][] matrizLaberinto;

  public Laberinto(Coordenada inicio, Coordenada salida, int altura, int ancho) {
    this.inicio = inicio;
    this.salida = salida;
    this.altura = altura;
    this.ancho = ancho;
    this.matrizLaberinto = new char[altura][ancho];
    generaLaberintoAleatorio();
  }

  public Laberinto() { // constructor largo pero por omisión, suena a una buena idea.
    Scanner in = new Scanner(System.in);
    System.out.println("Dame una altura para el laberinto");
    try {
      altura = in.nextInt();
    } catch (Exception e) {
    }
    System.out.println("Dame un ancho para el laberinto");
    try {
      ancho = in.nextInt();
      matrizLaberinto = new char[altura][ancho];
    } catch (Exception e) {

    }
    inicio = new Coordenada();
    salida = new Coordenada();
    System.out.println("Dame una coordenada de inicio. Ingresa el primer valor, presiona enter y luego el segundo.");
    try {
      inicio.setX(in.nextInt());
      inicio.setY(in.nextInt());
    } catch (Exception e) {
    }
    System.out.println("Dame una coordenada de salida. Ingresa el primer valor, presiona enter y luego el segundo.");
    try {
      salida.setX(in.nextInt());
      salida.setY(in.nextInt());
      in.close();
    } catch (Exception e) {

    }
    System.out.println("Iniciando laberinto aleatorio...");
    generaLaberintoAleatorio();
  }

  private void generaLaberintoAleatorio() {

    // creamos una pila para llevar un registro de las celdas visitadas
    Pila<Coordenada> pila = new Pila<>();

    // elegimos una casilla aleatoria como punto de partida
    Coordenada actual = inicio;
    matrizLaberinto[actual.getX()][actual.getY()] = ' ';

    // marcamos la casilla como visitada y la agregamos a la pila
    pila.push(actual);

    // mientras la pila no esté vacía
    while (!pila.esVacia()) {
      // obtenemos la casilla actual de la pila
      actual = pila.top();

      // si hay casillas vecinas no visitadas. Nota. U-know-who sugirio esto. 
      List<Coordenada> vecinos = obtenerVecinosNoVisitados(actual);
      if (!vecinos.isEmpty()) {
        // elegimos un vecino aleatorio
        Coordenada vecino = vecinos.get(rand.nextInt(vecinos.size()));

        // eliminamos la pared que separa a la casilla actual del vecino
        eliminarPared(actual, vecino);

        // marcamos la casilla vecina como visitada y la agregamos a la pila
        vecino.setVisitada(true);
        pila.push(vecino);
      } else {
        // si no hay vecinos no visitados, sacamos la casilla actual de la pila
        pila.pop();
      }
    }
  }

}
