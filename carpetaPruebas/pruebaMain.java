package carpetaPruebas;

public class pruebaMain {
    public static void main(String[] args) {
        abAvl arbol = new abAvl(5);
        arbol.insertarAvl(2);
        arbol.insertarAvl(3);
        arbol.insertarAvl(6);

        arbol.printInOrder();
    }
}
