package practico5ab.Ejercicios;
import java.util.Random;
import practico5ab.utils.arbol;
import practico5ab.utils.nodo;
public class ejercicio1y2 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = 0;
        numero = random.nextInt(26);
        arbol arbol = new arbol(numero);
        for(int i = 0; i<9; i++ )
        {
            numero = random.nextInt(26);
            arbol.insert(numero);
        }
        System.out.println("Todo se hizo correctamente.");

        System.out.println("Impreso en orden:");
        arbol.printInOrder();
    }
}
