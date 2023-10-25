package practico5ab.Ejercicios;

import practico5ab.utils.arbol;

public class ejercicio5 {
    public static void main(String[] args) {
        arbol arbol = new arbol(5);
        arbol.insert(4);
        arbol.insert(3);
        arbol.insert(2);
        arbol.insert(1);
        arbol.insert(6);
        arbol.insert(7);
        arbol.insert(8);
        arbol.insert(9);
        arbol.insert(10);
        System.out.println("Antes de eliminar un elemento: ");
        arbol.imprimirArbolillo(arbol.root, arbol.height());
        //arbol.printInOrder();
        /*System.out.println("Luego de eliminar un elemento: ");
        arbol.eliminarRec(arbol.root,8);
        arbol.printInOrder();*/
    }
}
