/**
 * Clase para tener objetos de tipo Coordenada en el laberinto.
 * @author Wallsified
 * @author gentle_earthquake
 * @version 1.0
 */
public class Coordenada {

  /**
   * Coordenada X
   */
  private int x;

  /**
   * Coordenada Y
   */
  private int y;

  /**
   * Constructor inicializador de la coordenada (0,0).
   * No todos los laberintos inician aqui, aunque se puede 
   * volver una constante. 
   */
  public Coordenada() {
    x = y = 0;
  }

  /**
   * Constructor dadado dos coordenadas en especifico.
   * i.e (3,8);
   * 
   * @param x Coordenada nueva X
   * @param y Coordenada nueva Y
   */
  public Coordenada(int x, int y) {
    setX(x);
    setY(y);
  }

  /**
   * Constructor dado una coordenada previa.
   * 
   * @param base Coordenada de la cual tomar los datos.
   */
  public Coordenada(Coordenada base) {
    setX(base.getX());
    setY(base.getY());
  }

  /**
   * Getter de la coordenada Y
   * 
   * @return int Coordenada Y
   */
  public int getY() {
    return y;
  }

  /**
   * Getter de la coordenada X
   * 
   * @return int Coordenada X
   */
  public int getX() {
    return x;
  }

  /**
   * Setter de la coordenada Y.
   * 
   * @param y Nueva coordenada Y.
   */
  public void setY(int y) {
    this.y = y;
  }

  /**
   * Setter de la coordenada X.
   * 
   * @param x Nueva coordenada X.
   */
  public void setX(int x) {
    this.x = x;
  }

  /**
   * Método para "moverse" entre el arreglo de coordenadas.
   * 
   * @param moveX Desplazamiento en X
   * @param moveY Desplazamiento en Y
   */
  public void moverCoordenadas(int moveX, int moveY) {
    x += moveX;
    y += moveY;
  }

  /**
   * Método para conocer distancia entre coordenadas.
   * Usamos la formula que nos dice que la distancia es
   * ((x2-x1)^2 + (y2-y1)^2)^1/2.
   * 
   * @param coord Coordenada de referencia.
   * @return Distancia entre coordenadas.
   */
  public double distanciaEntreCoordenadas(Coordenada coord) {
    double twoX = Math.pow((this.x - coord.getX()), 2);
    double twoY = Math.pow((this.y - coord.getY()), 2);
    return Math.sqrt(twoX + twoY);
  }

  /**
   * Método para comparar coordenadas.
   * 
   * @param coord Coordenada a comparar.
   * @return <code>true</code> si son iguales, <code>false</code> en otro caso.
   */
  @Override
  public boolean equals(Object coord) {
    Coordenada hemeAqui = (Coordenada) coord;
    return this.getX() == hemeAqui.getX() && this.getY() == hemeAqui.getY();
  }
}