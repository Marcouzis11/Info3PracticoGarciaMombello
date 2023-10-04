package practico4conlista.Ejercicios;
import practico4conlista.utils.cola;
import java.util.Scanner;
public class ej6EncolarYSumarNumeros {
    public static void main(String[] args) {
        cola cola = new cola();
        int num =0;
        int suma = 0;
        int cerrar = 1;

        Scanner consola = new Scanner(System.in);
        while(cerrar != 0)
        {
            System.out.println("Ingrese un numero: ");
            num = consola.nextInt();
            System.out.println("Ingrese cero si quiere cerrar.");
            cerrar = consola.nextInt();
            cola.enqueue(num);
        }

        while(cola.isEmpty() != true)
        {
            suma = suma + (int) cola.dequeue();
        }
        System.out.println("Suma: " + suma);

    }
}
