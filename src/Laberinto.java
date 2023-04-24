import java.util.InputMismatchException;
import java.util.Scanner;

public class Laberinto {

    int longitud, widht;
    

    public void startup () throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa longitud");
        longitud = in.nextInt();
        System.out.println("Ingresa anchura");
        widht = in.nextInt();
        in.close();
    }

}
