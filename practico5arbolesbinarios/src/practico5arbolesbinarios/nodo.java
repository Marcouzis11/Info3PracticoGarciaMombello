package practico5arbolesbinarios;


public class nodo<AnyType> {
    
    public AnyType element;
    public nodo<AnyType> left;
    public nodo<AnyType> right;
    
    
    public nodo()
    {
        this.element = null;
        this.left = null;
        this.right = null;
    }
    public nodo(AnyType element, nodo<AnyType> lt, nodo<AnyType> rt)
    {
        this.element = element;
        this.left = lt;
        this.right = rt;
    }
    
    
    
}