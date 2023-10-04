package practico4conlista.Tests;
import practico4conlista.utils.cola;
public class testColaLista {
    public static void main(String[] args) {
        cola cola = new cola();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        System.out.println(cola.front.next.elemento);
        while(cola.isEmpty() != true)
        {
            System.out.println(cola.dequeue());
        }
    }
}
