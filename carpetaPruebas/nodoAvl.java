package carpetaPruebas;

public class nodoAvl<AnyType> {
    AnyType element;
    nodoAvl<AnyType> left;
    nodoAvl<AnyType> right;

    nodoAvl(AnyType element)
    {
        this.element = element;
        left = null;
        right = null;
    }

    nodoAvl(AnyType element, nodoAvl left, nodoAvl right)
    {
        this.element = element;
        this.left = left;
        this.right = right;
    }
}
