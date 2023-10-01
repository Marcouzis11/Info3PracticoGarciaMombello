package tests;

import practico3pilaycola.utils.Cola;

public class testCola {

    public static void main(String[] args) {
        Cola colita = new Cola(2);
        colita.enqueue(1);
        colita.enqueue(2);
        
        /*colita.enqueue(3);
        System.out.println(colita.getFront());
        colita.enqueue(4);
        System.out.println(colita.getFront());
        colita.enqueue(5);
        System.out.println(colita.getFront());*/
        Cola cola = new Cola(5);
        cola = colita; //!No se puede realizar esto pq se copian las mismas direcciones de memoria y por lo tanto 2 colas distintas son iguales */

        System.out.println("Colita dequeue= "+colita.dequeue());
        System.out.println("Colita dequeue2= "+colita.dequeue());
        colita.enqueue(3);
        System.out.println("Cola dequeue3=" +colita.dequeue());








        /*System.out.println("COLA DEQUEUE");
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println("COLA DEQUEUE");*/
        //colita.dequeue();

        /*System.out.println("1: " + colita.getFront());
        //colita.makeEmpty();
        colita.dequeue();
        System.out.println("2: " +colita.getFront());
        colita.dequeue();
        System.out.println("3: " +colita.getFront());
        colita.dequeue();
        System.out.println("4: " +colita.getFront());*/
    }
}
