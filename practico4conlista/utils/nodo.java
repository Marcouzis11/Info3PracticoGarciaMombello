package practico4conlista.utils;

public class nodo<AnyType> {
    public AnyType elemento;
    public nodo next;


    nodo(AnyType elemento)
    {
        this.elemento = elemento;
        this.next = null;
    }

    nodo(AnyType elemento, nodo<AnyType> nodo)
    {
        this.elemento = elemento;
        this.next = nodo;
    }
}
