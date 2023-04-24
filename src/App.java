import Colas.Cola;



public class App {
    
    /** 
     * @param args[]
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        System.out.println("Hello, World!");
        
        Laberinto laby = new Laberinto();
        laby.startup();

        int[] hello = {1,2,3,4,5,6,7,8,9,0, laby.longitud, laby.widht};

        Cola<Integer> prueba = new Cola<>();
        for (int hola : hello) {    
            prueba.queue(hola);
        }

        System.out.print(prueba.toString());
        
        
        
        
    }
}
