package practico5ab.Ejercicios;
import java.util.Random;
import practico5ab.utils.arbol;
import practico5ab.utils.nodo;
public class ejercicio3y4 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = 0;
        numero = random.nextInt(26);
        arbol arbol = new arbol(1);
        arbol.insertRep(1);
        arbol.insertRep(2);
        arbol.insertRep(2);
        arbol.insertRep(2);
        arbol.insertRep(2);

        arbol.printInOrder();
        System.out.println("Se pueden repetir valores correctamente");
        System.out.println(arbol.height());

    }

}
