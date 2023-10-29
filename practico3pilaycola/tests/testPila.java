
package practico3pilaycola.tests;

import practico3pilaycola.utils.Stack;

public class testPila {
    public static void main(String[] args) {
        Stack pila = new Stack(5);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        System.out.println("Top de pila: " + pila.top());

        System.out.println("Todos los elementos de la pila:");
        for(int i = 0; i< pila.size ; i++)
        {
            System.out.println(pila.top());
            pila.pop();
        }

    }
}
