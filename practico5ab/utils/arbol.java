package practico5ab.utils;
import practico5ab.utils.nodo;

public class arbol<AnyType> {

    public nodo<AnyType> root;

    public arbol()
    {
        root = null;
    }
    
    public arbol(AnyType rootItem)
    {
        root = new nodo<AnyType>(rootItem, null, null);
    }

    public void dtree(AnyType buscar)
    {
        root.dtree(root, buscar);
        printInOrder();
    }

    public nodo<AnyType> getRoot()
    {
        return root;
    }
    
    public int size()
    {
        return nodo.size(root);
    }

    public int height()
    {
        return nodo.height(root);
    }

    public void makeEmpty()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void printPreOrder()
    {
        if(root != null)
            root.printPreOrder();
    }

    public void printInOrder()
    {
        if(root != null)
            root.printInOrder();
    }

    public void printPostOrder()
    {
        if(root != null)
            root.printPostOrder();
    }

    public void merge(AnyType rootItem, arbol<AnyType> t1, arbol<AnyType> t2)
    {
        if(t1.root == t2.root && t1.root != null)
            throw new IllegalArgumentException();

        //Allocate new node
        root = new nodo<AnyType>(rootItem,t1.root,t2.root);

        //Ensure that every node is in one tree
        if(this != t1)
            t1.root = null;
        if(this != t2)
            t2.root = null;
    }

    public void insert(AnyType elemento)
    {
        root.insert(elemento);
    }

    public void insertRep(AnyType elemento)
    {
        root.insertRep(elemento);
    }


}
