
package practico5arbolesbinarios;


public class arbol<AnyType> {
    public nodo<AnyType> root;
    public Integer rootItem;
    public arbol()
    {
        root = null;
    }
    
    public arbol(AnyType rootItem)
    {
        root = new nodo<AnyType>(rootItem, null, null);
    }
    
    public void insert(Integer elemento)
    {
        if(elemento.compareTo(rootItem) > 0)
        {
            
        }
    }
}
