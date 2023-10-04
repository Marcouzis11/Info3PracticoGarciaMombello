package practico4conlista.Ejercicios;
import practico4conlista.utils.cola;
import java.util.Scanner;
public class ej7ColaListaOrdenarNumeros {
    public static void main(String[] args) {
        cola cola = new cola();
        cola.enqueue(1);
        cola.enqueue(3);
        cola.enqueue(2);
        cola.enqueue(7);
        cola.enqueue(6);
        cola.enqueue(8);
        int x = 6;
        int temp = 0;

        
        for(int i = 0; i<20; i++)
        {
            if((int)cola.front.elemento <= (int)cola.front.next.elemento)
            {
                System.out.println(cola.dequeue());
            }
            else
            {
                temp = (int) cola.getFront();
                cola.front.elemento = cola.front.next.elemento;
                cola.front.next.elemento = temp;
            }
        }
    }
}
