
package practico3pilaycola.utils;

public class Nodo<AnyType> {
    
    public AnyType data;
    public Nodo<AnyType> next;
    
    public Nodo(AnyType data) {
        this.data = data;
        this.next = null;
    }
    
}
