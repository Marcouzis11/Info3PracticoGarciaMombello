package practico4conlista.Ejercicios;
import practico4conlista.utils.cola;
import practico4conlista.utils.pila;
import java.util.Scanner;
public class ej7ColaListaOrdenarNumeros {
    public static void main(String[] args) {
        cola cola = new cola();
        Scanner consola = new Scanner(System.in);
        int opcion = 0;
        int dato;
        int tamaño = 0;

        do
        {
            System.out.println("Ingrese: \n 0-Cerrar \n 1-Volver a ingresar dato");
            opcion = consola.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Dato: ");
                    dato = consola.nextInt();
                    cola.enqueue(dato);
                    tamaño++;
                    break;
            }
        }while(opcion != 0);

        int [] array = new int[tamaño];
        for(int i = 0; i<tamaño; i++)
        {
            array[i] = (int) cola.dequeue();
        }

        for (int p = 1; p<array.length; p++)
        {
            Integer temp = array[p];
            int j = p;
            for( ; j > 0 && temp.compareTo(array[j-1]) < 0 ; j-- )
            {
                array[j] = array[j-1];
            }
            array[j] = temp;
        }

        for(int j=0; j<array.length;j++)
        {
            cola.enqueue(array[j]);
        }

        System.out.println("Cola ordenada:");
        while(cola.isEmpty() != true)
        {
            System.out.println(cola.dequeue());
        }
    }
}
