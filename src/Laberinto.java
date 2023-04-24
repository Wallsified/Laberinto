import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Laberinto {

    // Les Atributes
    int longitud; 
    int widht;
    private Coordenada start;
    private Coordenada end;
    private int[][] walls; //mira, hice un yo. 
    private int[][] way;

    public void startup() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa longitud");
        longitud = in.nextInt(); //esto deberia ir en un try-catch?
        System.out.println("Ingresa anchura");
        widht = in.nextInt();
        in.close();
    }

    
}
