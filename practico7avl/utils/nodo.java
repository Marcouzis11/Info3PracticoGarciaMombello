package practico7avl.utils;

public class nodo<AnyType> {
    public AnyType element;
    public nodo<AnyType> left;
    public nodo<AnyType> right;
    public int peso;
    
    
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

    public void insert(AnyType elemento) //No permite insertar valores repetidos, los repetidos son ignorados
    {
        if( (int) elemento < (int) element)
        {
            if(this.left == null)
            {
                this.left = new nodo(elemento,null,null);
            }
            else
            {
                this.left.insert(elemento);
            }
        }
        else
        {
            if((int) elemento > (int) element)
            {
                if(this.right == null)
                {
                    this.right = new nodo(elemento,null,null);
                }
                else
                {
                    this.right.insert(elemento);
                }
            }
        }
    }

    public void insertRep(AnyType elemento) //Permite insertar valores repetidos siempre a la izquierda
    {
        if((int) elemento < (int) element)
        {
            if(this.left == null)
            {
                this.left = new nodo(elemento,null,null);
            }
            else
            {
                this.left.insertRep(elemento);
            }
        }
        else
        {
            if((int) elemento > (int) element)
            {
                if(this.right == null)
                {
                    this.right = new nodo(elemento,null,null);
                }
                else
                {
                    this.right.insertRep(elemento);
                }
            }
            else
            {
                if((int) elemento == (int) element)
                {
                    if(this.left == null)
                    {
                        this.left = new nodo(elemento,null,null);
                    }
                    else
                    {
                        this.left.insertRep(elemento);
                    }
                }
            }
        }
    }
    

    public AnyType getElement()
    {
        return element;
    }

    public nodo<AnyType> getLeft()
    {
        return left;
    }

    public nodo<AnyType> getRight()
    {
        return right;
    }

    public void setElement(AnyType x)
    {
        element = x;
    }

    public void setLeft(nodo<AnyType> t)
    {
        left = t;
    }

    public void setRight(nodo<AnyType> t)
    {
        right = t;
    }

    public static <AnyType> int size(nodo<AnyType> t)
    {
        if(t==null)
            return 0;
        else
            return 1 + size(t.left) + size(t.right);
    }

    public static <AnyType> int height (nodo<AnyType> t)
    {
        if(t==null)
            return -1;
        else
            return 1+Math.max(height(t.left),height(t.right));
    }

    public nodo<AnyType> duplicate()
    {
        nodo<AnyType> root = new nodo<AnyType> (element,null,null);

        if(root.left != null)
            root.left = left.duplicate();
        if(root.right != null)
            root.right = right.duplicate();
        return root;
    }

    public void printPreOrder()
    {
        System.out.println(element);
        if(left != null)
            left.printPreOrder();
        if(right != null)
            right.printPreOrder();
    }

    public void printPostOrder()
    {
        if(left != null)
            left.printPostOrder();
        if(right != null)
            right.printPostOrder();
        System.out.println(element);
    }

    public void printInOrder()
    {
        if(left != null)
        {
            System.out.println("\t");
            left.printInOrder();
        }
        System.out.println("\t" + element);
        if(right!=null)
        {
            System.out.println("\t");
            right.printInOrder();
        }
    }
}
