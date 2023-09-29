package tests;

import practico3pilaycola.utils.Cola;

public class testCola {

    public static void main(String[] args) {
        Cola colita = new Cola(5);
        colita.enqueue(1);
        System.out.println(colita.getFront());
        colita.enqueue(2);
        System.out.println(colita.getFront());
        colita.enqueue(3);
        System.out.println(colita.getFront());
        colita.enqueue(4);
        System.out.println(colita.getFront());
        colita.enqueue(5);
        System.out.println(colita.getFront());
        
        //colita.dequeue();

        System.out.println("1: " + colita.getFront());
        //colita.makeEmpty();
        colita.dequeue();
        System.out.println("2: " +colita.getFront());
        colita.dequeue();
        System.out.println("3: " +colita.getFront());
        colita.dequeue();
        System.out.println("4: " +colita.getFront()); //hola
    }
}
