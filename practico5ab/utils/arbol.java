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

    public  nodo eliminarRec(nodo root, int valor) {
        if (root == null) {
            return root;
        }
        if ((int)valor < (int)root.element) {
            root.left = eliminarRec(root.left, valor);
        } else if ((int)valor > (int)root.element) {
            root.right = eliminarRec(root.right, valor);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.element = encontrarMinimoValor(root.right);
            root.right = eliminarRec(root.right, (int)root.element);
        }
        return root;
    }

    int encontrarMinimoValor(nodo root) {
        int minimoValor = (int) root.element;
        while (root.left != null) {
            minimoValor = (int) root.left.element;
            root = root.left;
        }
        return minimoValor;
    }


}
